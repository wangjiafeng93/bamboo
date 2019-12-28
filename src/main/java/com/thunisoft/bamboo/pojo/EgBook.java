package com.thunisoft.bamboo.pojo;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotBlank;
import io.swagger.annotations.ApiModel;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;
import javax.persistence.Column;
import com.alibaba.fastjson.annotation.JSONField;
import javax.persistence.Id;
import java.util.Date;
import com.thunisoft.artery.data.annotation.CodeType;
/**
 * 
 * EgBook
 *
 * @description 
 * @author artery6一键生成
 * @author huayu
 * @date 2019年05月13日 21:45
 * @version 1.0
 */
@Table(name="{db.t_eg_book}")
@ApiModel("图书")
public class EgBook  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** uuid */
    @ApiModelProperty("uuid")
    @NotBlank
    @Size(max=32)
    @Id
    @Column(name="c_id")
    private String id;

    /** 图书名称 */
    @ApiModelProperty("图书名称")
    @NotBlank
    @Size(max=300)
    @Column(name="c_name")
    private String name;

    /** 作者 */
    @ApiModelProperty("作者")
    @Size(max=300)
    @Column(name="c_auth")
    private String auth;

    /** 出版日期 */
    @ApiModelProperty("出版日期")
    @Column(name="d_publisher")
    private Date publisher;

    /** 购买日期 */
    @ApiModelProperty("购买日期")
    @Column(name="d_buy")
    private Date buy;

    /** 图书室id */
    @ApiModelProperty("图书室id")
    @NotBlank
    @Size(max=32)
    @Column(name="c_libraryid")
    private String libraryid;

    /** ISBN */
    @ApiModelProperty("ISBN")
    @Size(max=300)
    @Column(name="c_isbn")
    private String isbn;

    /** 第几版 */
    @ApiModelProperty("第几版")
    @Size(max=300)
    @Column(name="c_version")
    private String version;

    /** 是否有效 */
    @ApiModelProperty("是否有效")
    @CodeType("-1")
    @Column(name="n_valid")
    private Integer valid;

    /** 删除此图书的原因 */
    @ApiModelProperty("删除此图书的原因")
    @Column(name="t_invalidreason")
    private String invalidreason;

    /** 类别 */
    @ApiModelProperty("类别")
    @CodeType("-600")
    @Column(name="n_type")
    private Integer type;


    /**
     * 获取 c_id
     *
     * @return uuid
     */
    @JSONField(name = "id") 
    public String getId() {
        return id;
    }

    /**
     * 设置 c_id
     *
     * @param id uuid
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * 获取 c_name
     *
     * @return 图书名称
     */
    @JSONField(name = "name") 
    public String getName() {
        return name;
    }

    /**
     * 设置 c_name
     *
     * @param name 图书名称
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取 c_auth
     *
     * @return 作者
     */
    @JSONField(name = "auth") 
    public String getAuth() {
        return auth;
    }

    /**
     * 设置 c_auth
     *
     * @param auth 作者
     */
    public void setAuth(String auth) {
        this.auth = auth;
    }
    /**
     * 获取 d_publisher
     *
     * @return 出版日期
     */
    @JSONField(name = "publisher") 
    public Date getPublisher() {
        return publisher;
    }

    /**
     * 设置 d_publisher
     *
     * @param publisher 出版日期
     */
    public void setPublisher(Date publisher) {
        this.publisher = publisher;
    }
    /**
     * 获取 d_buy
     *
     * @return 购买日期
     */
    @JSONField(name = "buy") 
    public Date getBuy() {
        return buy;
    }

    /**
     * 设置 d_buy
     *
     * @param buy 购买日期
     */
    public void setBuy(Date buy) {
        this.buy = buy;
    }
    /**
     * 获取 c_libraryid
     *
     * @return 图书室id
     */
    @JSONField(name = "libraryid") 
    public String getLibraryid() {
        return libraryid;
    }

    /**
     * 设置 c_libraryid
     *
     * @param libraryid 图书室id
     */
    public void setLibraryid(String libraryid) {
        this.libraryid = libraryid;
    }
    /**
     * 获取 c_isbn
     *
     * @return ISBN
     */
    @JSONField(name = "isbn") 
    public String getIsbn() {
        return isbn;
    }

    /**
     * 设置 c_isbn
     *
     * @param isbn ISBN
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    /**
     * 获取 c_version
     *
     * @return 第几版
     */
    @JSONField(name = "version") 
    public String getVersion() {
        return version;
    }

    /**
     * 设置 c_version
     *
     * @param version 第几版
     */
    public void setVersion(String version) {
        this.version = version;
    }
    /**
     * 获取 n_valid
     *
     * @return 是否有效
     */
    @JSONField(name = "valid") 
    public Integer getValid() {
        return valid;
    }

    /**
     * 设置 n_valid
     *
     * @param valid 是否有效
     */
    public void setValid(Integer valid) {
        this.valid = valid;
    }
    /**
     * 获取 t_invalidreason
     *
     * @return 删除此图书的原因
     */
    @JSONField(name = "invalidreason") 
    public String getInvalidreason() {
        return invalidreason;
    }

    /**
     * 设置 t_invalidreason
     *
     * @param invalidreason 删除此图书的原因
     */
    public void setInvalidreason(String invalidreason) {
        this.invalidreason = invalidreason;
    }
    /**
     * 获取 n_type
     *
     * @return 类别
     */
    @JSONField(name = "type") 
    public Integer getType() {
        return type;
    }

    /**
     * 设置 n_type
     *
     * @param type 类别
     */
    public void setType(Integer type) {
        this.type = type;
    }

}
