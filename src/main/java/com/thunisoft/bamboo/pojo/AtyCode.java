package com.thunisoft.bamboo.pojo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;
import javax.persistence.Column;
import com.alibaba.fastjson.annotation.JSONField;
import javax.persistence.Id;
/**
 * 
 * AtyCode
 *
 * @description 
 * @author artery6一键生成
 * @author huayu
 * @date 2019年11月18日 14:48
 * @version 1.0
 */
@Table(name="{db.t_aty_code}")
public class AtyCode  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** 代码类型编号 */
    @NotBlank
    @Size(max=50)
    @Id
    @Column(name="c_pid")
    private String pid;

    /** 代码 */
    @NotBlank
    @Size(max=50)
    @Id
    @Column(name="c_code")
    private String code;

    /** 代码名称 */
    @NotBlank
    @Size(max=300)
    @Column(name="c_name")
    private String name;

    /** 可否维护 */
    @NotNull
    @Column(name="n_kwh")
    private Integer kwh;

    /** 分级信息 */
    @Size(max=300)
    @Column(name="c_levelinfo")
    private String levelinfo;

    /** 是否有效 */
    @NotNull
    @Column(name="n_valid")
    private Integer valid;

    /** 显示顺序 */
    @NotNull
    @Column(name="n_order")
    private Integer order;

    /** 代码简拼 */
    @Size(max=300)
    @Column(name="c_dmjp")
    private String dmjp;


    /**
     * 获取 c_pid
     *
     * @return 代码类型编号
     */
    @JSONField(name = "pid") 
    public String getPid() {
        return pid;
    }

    /**
     * 设置 c_pid
     *
     * @param pid 代码类型编号
     */
    public void setPid(String pid) {
        this.pid = pid;
    }
    /**
     * 获取 c_code
     *
     * @return 代码
     */
    @JSONField(name = "code") 
    public String getCode() {
        return code;
    }

    /**
     * 设置 c_code
     *
     * @param code 代码
     */
    public void setCode(String code) {
        this.code = code;
    }
    /**
     * 获取 c_name
     *
     * @return 代码名称
     */
    @JSONField(name = "name") 
    public String getName() {
        return name;
    }

    /**
     * 设置 c_name
     *
     * @param name 代码名称
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取 n_kwh
     *
     * @return 可否维护
     */
    @JSONField(name = "kwh") 
    public Integer getKwh() {
        return kwh;
    }

    /**
     * 设置 n_kwh
     *
     * @param kwh 可否维护
     */
    public void setKwh(Integer kwh) {
        this.kwh = kwh;
    }
    /**
     * 获取 c_levelinfo
     *
     * @return 分级信息
     */
    @JSONField(name = "levelinfo") 
    public String getLevelinfo() {
        return levelinfo;
    }

    /**
     * 设置 c_levelinfo
     *
     * @param levelinfo 分级信息
     */
    public void setLevelinfo(String levelinfo) {
        this.levelinfo = levelinfo;
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
     * 获取 n_order
     *
     * @return 显示顺序
     */
    @JSONField(name = "order") 
    public Integer getOrder() {
        return order;
    }

    /**
     * 设置 n_order
     *
     * @param order 显示顺序
     */
    public void setOrder(Integer order) {
        this.order = order;
    }
    /**
     * 获取 c_dmjp
     *
     * @return 代码简拼
     */
    @JSONField(name = "dmjp") 
    public String getDmjp() {
        return dmjp;
    }

    /**
     * 设置 c_dmjp
     *
     * @param dmjp 代码简拼
     */
    public void setDmjp(String dmjp) {
        this.dmjp = dmjp;
    }

}
