package jp.co.planaria.favoriteanime.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.planaria.favoriteanime.entity.Anime;

@Mapper
public interface AnimeMapper {
	
	public List<Anime> selectAll();

}
