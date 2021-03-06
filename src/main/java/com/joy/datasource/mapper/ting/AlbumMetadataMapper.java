package com.joy.datasource.mapper.ting;

import com.joy.datasource.model.ting.AlbumMetadata;
import com.joy.datasource.model.ting.AlbumMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
public interface AlbumMetadataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_album_metadata
     *
     * @mbggenerated
     */
    int countByExample(AlbumMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_album_metadata
     *
     * @mbggenerated
     */
    int deleteByExample(AlbumMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_album_metadata
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_album_metadata
     *
     * @mbggenerated
     */
    int insert(AlbumMetadata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_album_metadata
     *
     * @mbggenerated
     */
    int insertSelective(AlbumMetadata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_album_metadata
     *
     * @mbggenerated
     */
    List<AlbumMetadata> selectByExampleWithRowbounds(AlbumMetadataExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_album_metadata
     *
     * @mbggenerated
     */
    List<AlbumMetadata> selectByExample(AlbumMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_album_metadata
     *
     * @mbggenerated
     */
    AlbumMetadata selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_album_metadata
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AlbumMetadata record, @Param("example") AlbumMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_album_metadata
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AlbumMetadata record, @Param("example") AlbumMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_album_metadata
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AlbumMetadata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_album_metadata
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AlbumMetadata record);
}