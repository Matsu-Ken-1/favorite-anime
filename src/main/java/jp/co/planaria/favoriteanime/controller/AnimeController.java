package jp.co.planaria.favoriteanime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.planaria.favoriteanime.entity.Anime;
import jp.co.planaria.favoriteanime.entity.AnimeCondition;
import jp.co.planaria.favoriteanime.service.AnimeService;

/**
 * アニメ画面を制御するController
 * 
 * @author matsumotokenta
 */

@Controller
public class AnimeController {
	
	@Autowired
	AnimeService service;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Anime> animes = service.getAnimeList();
		
		model.addAttribute("animes", animes);
		
		return "list";
	}
	
	@RequestMapping("/search")
	public String search(AnimeCondition condition, Model model) {
		List<Anime> animes = service.serchAnimeListByCondition(condition);
		model.addAttribute("animes", animes);
		
		return "list";
	}

}
