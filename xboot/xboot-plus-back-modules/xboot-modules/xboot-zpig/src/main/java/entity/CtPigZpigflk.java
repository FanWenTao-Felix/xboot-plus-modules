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
 * @TableName CT_PIG_ZPIGFLK
 */
@Table(name="CT_PIG_ZPIGFLK")
@TableName(value = "CT_PIG_ZPIGFLK")
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@ApiModel(value = "种猪档案")
public class CtPigZpigflk implements Serializable {
    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "FID")
    private String fid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "FCREATORID")
    private String fcreatorid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "FCREATETIME")
    private Date fcreatetime;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "FLASTUPDATEUSERID")
    private String flastupdateuserid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "FLASTUPDATETIME")
    private Date flastupdatetime;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "FCONTROLUNITID")
    private String fcontrolunitid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "FNUMBER")
    private String fnumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "FBIZDATE")
    private Date fbizdate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "FHANDLERID")
    private String fhandlerid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "FDESCRIPTION")
    private String fdescription;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "FHASEFFECTED")
    private Long fhaseffected;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "FAUDITORID")
    private String fauditorid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "FSOURCEBILLID")
    private String fsourcebillid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "FSOURCEFUNCTION")
    private String fsourcefunction;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFORGUNITID")
    private String cforgunitid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFERHAO")
    private String cferhao;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFGENETICSID")
    private String cfgeneticsid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFSEX")
    private String cfsex;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFQUNTIID")
    private String cfquntiid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFSHCHANLINEID")
    private String cfshchanlineid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFJINJIAOXISHU")
    private BigDecimal cfjinjiaoxishu;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFLAIYUANXZID")
    private String cflaiyuanxzid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFLAIYUANORGID")
    private String cflaiyuanorgid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFLAIYUANSHCHANLIN")
    private String cflaiyuanshchanlin;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFWAIJINLAIYUANID")
    private String cfwaijinlaiyuanid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFDATE")
    private Date cfdate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFBORNDATE")
    private Date cfborndate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFBORNWT")
    private BigDecimal cfbornwt;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFDAYSWT")
    private BigDecimal cfdayswt;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFLICHANGDATE")
    private Date cflichangdate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFLICHANGTYPEID")
    private String cflichangtypeid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFFIRSTCJDATE")
    private Date cffirstcjdate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFFATHERERHAO")
    private String cffathererhao;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFFUFUERHAO")
    private String cffufuerhao;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFFUMUERHAO")
    private String cffumuerhao;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFFATHERID")
    private String cffatherid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFFUFUID")
    private String cffufuid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFFUMUID")
    private String cffumuid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFMOTHERERHAO")
    private String cfmothererhao;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFMUMUERHAO")
    private String cfmumuerhao;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFMUFUERHAO")
    private String cfmufuerhao;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFMOTHERID")
    private String cfmotherid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFMUMUID")
    private String cfmumuid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFMUFUID")
    private String cfmufuid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFNOWSTATUSID")
    private String cfnowstatusid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFZPIGXINGZHIID")
    private String cfzpigxingzhiid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFYUANERHAO")
    private String cfyuanerhao;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFPINXIID")
    private String cfpinxiid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFNOWSTATUSDATE")
    private Date cfnowstatusdate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFGETIHAO")
    private String cfgetihao;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFERQUEHAO")
    private String cferquehao;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFPICI")
    private String cfpici;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFZHUSHEID")
    private String cfzhusheid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFIFYISALE")
    private Long cfifyisale;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFSUMZAIQTY")
    private BigDecimal cfsumzaiqty;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFHUOZAIQTY")
    private BigDecimal cfhuozaiqty;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFSUMCJCOUNT")
    private BigDecimal cfsumcjcount;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFNOWTAICI")
    private BigDecimal cfnowtaici;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFNOWQINGQI")
    private BigDecimal cfnowqingqi;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFZUORUQTY")
    private BigDecimal cfzuoruqty;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFYOURUQTY")
    private BigDecimal cfyouruqty;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFSOWPLANEQTY")
    private BigDecimal cfsowplaneqty;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFSUMHAOLIAOQTY")
    private BigDecimal cfsumhaoliaoqty;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFSUMHAOLIAOAMT")
    private BigDecimal cfsumhaoliaoamt;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFSUMHAOYAOAMT")
    private BigDecimal cfsumhaoyaoamt;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFSUMHAOJINGAMT")
    private BigDecimal cfsumhaojingamt;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFFANQINGQTY")
    private BigDecimal cffanqingqty;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFIFFAQING")
    private Long cfiffaqing;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFLIUCHANQTY")
    private BigDecimal cfliuchanqty;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFJINGYEQTY")
    private BigDecimal cfjingyeqty;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFPEIZHONGQTY")
    private BigDecimal cfpeizhongqty;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFFIRSTPEIZHONGDATE")
    private Date cffirstpeizhongdate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFYUJIFENMIANDATE")
    private Date cfyujifenmiandate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFLASTDDDATE")
    private Date cflastdddate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFISDISABLE")
    private Long cfisdisable;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "CFZAIFLKID")
    private String cfzaiflkid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    @Column(name = "FKAICHANDATE")
    private Date fkaichandate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CT_PIG_ZPIGFLK
     *
     * @mbg.generated Mon Jan 11 08:58:12 CST 2021
     */
    private static final long serialVersionUID = 1L;
}