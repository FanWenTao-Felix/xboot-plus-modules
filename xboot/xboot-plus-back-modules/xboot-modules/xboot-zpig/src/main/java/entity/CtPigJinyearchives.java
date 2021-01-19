package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @author AIERXUAN
 * @TableName CT_PIG_JINYEARCHIVES
 */
@Table(name="CT_PIG_JINYEARCHIVES")
@TableName("CT_PIG_JINYEARCHIVES")
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@ApiModel(value = "精液档案")
public class CtPigJinyearchives implements Serializable {
    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "FID")
    private String fid;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "FCREATORID")
    private String fcreatorid;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "FCREATETIME")
    private Date fcreatetime;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "FLASTUPDATEUSERID")
    private String flastupdateuserid;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "FLASTUPDATETIME")
    private Date flastupdatetime;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "FCONTROLUNITID")
    private String fcontrolunitid;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "FNUMBER")
    private String fnumber;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "FBIZDATE")
    private Date fbizdate;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "FHANDLERID")
    private String fhandlerid;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "FDESCRIPTION")
    private String fdescription;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "FHASEFFECTED")
    private Long fhaseffected;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "FAUDITORID")
    private String fauditorid;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "FSOURCEBILLID")
    private String fsourcebillid;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "FSOURCEFUNCTION")
    private String fsourcefunction;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "FFIVOUCHERED")
    private Long ffivouchered;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFGENETICSID")
    private String cfgeneticsid;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFPEIJINPERSONID")
    private String cfpeijinpersonid;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFJILIANG")
    private BigDecimal cfjiliang;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFJINYEAMOUNT")
    private BigDecimal cfjinyeamount;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFGONGZHUERHAO")
    private String cfgongzhuerhao;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFJINGYETYPE")
    private String cfjingyetype;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFOUTDATE")
    private Date cfoutdate;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFHUOLI")
    private BigDecimal cfhuoli;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFORGUNITID")
    private String cforgunitid;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFIFUSED")
    private Long cfifused;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFWAIJINID")
    private String cfwaijinid;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFPEIZHIID")
    private String cfpeizhiid;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFGONGZHUID")
    private String cfgongzhuid;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFBATCHNUMBER")
    private String cfbatchnumber;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFDILUENTSPECIFICA")
    private String cfdiluentspecifica;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFIFREIMBURSED")
    private Long cfifreimbursed;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFYOUXIAOJINGZIQTY")
    private String cfyouxiaojingziqty;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFGONGZHUERHAOID")
    private String cfgongzhuerhaoid;

    /**
     * 
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    @Column(name = "CFDOSEID")
    private String cfdoseid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CT_PIG_JINYEARCHIVES
     *
     * @mbg.generated Thu Jan 14 17:06:56 CST 2021
     */
    private static final long serialVersionUID = 1L;
}