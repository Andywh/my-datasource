package com.joy.datasource.model.ting;

import java.util.Date;

public class AlbumMetadata {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_album_metadata.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_album_metadata.album_id
     *
     * @mbggenerated
     */
    private Long albumId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_album_metadata.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_album_metadata.metadata_id
     *
     * @mbggenerated
     */
    private Long metadataId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_album_metadata.metadata_value
     *
     * @mbggenerated
     */
    private String metadataValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_album_metadata.created_at
     *
     * @mbggenerated
     */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_album_metadata.updated_at
     *
     * @mbggenerated
     */
    private Date updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_album_metadata.transfer_flag
     *
     * @mbggenerated
     */
    private Integer transferFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_album_metadata.id
     *
     * @return the value of tb_album_metadata.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_album_metadata.id
     *
     * @param id the value for tb_album_metadata.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_album_metadata.album_id
     *
     * @return the value of tb_album_metadata.album_id
     *
     * @mbggenerated
     */
    public Long getAlbumId() {
        return albumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_album_metadata.album_id
     *
     * @param albumId the value for tb_album_metadata.album_id
     *
     * @mbggenerated
     */
    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_album_metadata.type
     *
     * @return the value of tb_album_metadata.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_album_metadata.type
     *
     * @param type the value for tb_album_metadata.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_album_metadata.metadata_id
     *
     * @return the value of tb_album_metadata.metadata_id
     *
     * @mbggenerated
     */
    public Long getMetadataId() {
        return metadataId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_album_metadata.metadata_id
     *
     * @param metadataId the value for tb_album_metadata.metadata_id
     *
     * @mbggenerated
     */
    public void setMetadataId(Long metadataId) {
        this.metadataId = metadataId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_album_metadata.metadata_value
     *
     * @return the value of tb_album_metadata.metadata_value
     *
     * @mbggenerated
     */
    public String getMetadataValue() {
        return metadataValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_album_metadata.metadata_value
     *
     * @param metadataValue the value for tb_album_metadata.metadata_value
     *
     * @mbggenerated
     */
    public void setMetadataValue(String metadataValue) {
        this.metadataValue = metadataValue == null ? null : metadataValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_album_metadata.created_at
     *
     * @return the value of tb_album_metadata.created_at
     *
     * @mbggenerated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_album_metadata.created_at
     *
     * @param createdAt the value for tb_album_metadata.created_at
     *
     * @mbggenerated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_album_metadata.updated_at
     *
     * @return the value of tb_album_metadata.updated_at
     *
     * @mbggenerated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_album_metadata.updated_at
     *
     * @param updatedAt the value for tb_album_metadata.updated_at
     *
     * @mbggenerated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_album_metadata.transfer_flag
     *
     * @return the value of tb_album_metadata.transfer_flag
     *
     * @mbggenerated
     */
    public Integer getTransferFlag() {
        return transferFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_album_metadata.transfer_flag
     *
     * @param transferFlag the value for tb_album_metadata.transfer_flag
     *
     * @mbggenerated
     */
    public void setTransferFlag(Integer transferFlag) {
        this.transferFlag = transferFlag;
    }
}