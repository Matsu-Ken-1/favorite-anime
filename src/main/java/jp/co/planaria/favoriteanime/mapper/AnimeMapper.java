package jp.co.planaria.favoriteanime.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.planaria.favoriteanime.entity.Anime;
import jp.co.planaria.favoriteanime.entity.AnimeCondition;

@Mapper
public interface AnimeMapper {
	
	// 全件検索
	public List<Anime> selectAll();
	
	// 検索条件に該当するリスト検索
	public List<Anime> selectByCondition(AnimeCondition condition);

}
