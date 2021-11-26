package jp.co.planaria.favoriteanime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.planaria.favoriteanime.entity.Anime;
import jp.co.planaria.favoriteanime.entity.AnimeCondition;
import jp.co.planaria.favoriteanime.mapper.AnimeMapper;

@Service
public class AnimeService {
	
	@Autowired
	AnimeMapper mapper;
	
	// アニメリストを全件取得
	public List<Anime> getAnimeList() {
		return mapper.selectAll();
	}
	
	// アニメリストを検索条件で取得
	public List<Anime> serchAnimeListByCondition(AnimeCondition condition) {
		return mapper.selectByCondition(condition);
	}

}
