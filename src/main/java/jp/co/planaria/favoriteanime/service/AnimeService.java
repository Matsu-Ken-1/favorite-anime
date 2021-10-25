package jp.co.planaria.favoriteanime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.planaria.favoriteanime.entity.Anime;
import jp.co.planaria.favoriteanime.mapper.AnimeMapper;

@Service
public class AnimeService {
	
	@Autowired
	AnimeMapper mapper;
	
	public List<Anime> getAnimeList() {
		return mapper.selectAll();
	}

}
