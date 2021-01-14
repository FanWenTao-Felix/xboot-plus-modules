package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @TableName CT_PIG_SPERMALLOTRECORD
 */
@Table(name="CT_PIG_SPERMALLOTRECORD")
@TableName("CT_PIG_SPERMALLOTRECORD")
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@ApiModel(value = "精液调拨记录")
public class CtPigSpermallotrecord implements Serializable {
    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "FID")
    private String fid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "FCREATORID")
    private String fcreatorid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "FCREATETIME")
    private Date fcreatetime;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "FLASTUPDATEUSERID")
    private String flastupdateuserid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "FLASTUPDATETIME")
    private Date flastupdatetime;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "FCONTROLUNITID")
    private String fcontrolunitid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "FNUMBER")
    private String fnumber;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "FBIZDATE")
    private Date fbizdate;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "FHANDLERID")
    private String fhandlerid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "FDESCRIPTION")
    private String fdescription;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "FHASEFFECTED")
    private Long fhaseffected;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "FAUDITORID")
    private String fauditorid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "FSOURCEBILLID")
    private String fsourcebillid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "FSOURCEFUNCTION")
    private String fsourcefunction;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "FFIVOUCHERED")
    private Long ffivouchered;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFORGUNITID")
    private String cforgunitid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFWEEKHAO")
    private String cfweekhao;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFTOORGUNITID")
    private String cftoorgunitid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFGENETICSID")
    private String cfgeneticsid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFIFAUDITING")
    private Long cfifauditing;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFAUDITUSERID")
    private String cfaudituserid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFBOARID")
    private String cfboarid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFBATCHNUMBER")
    private String cfbatchnumber;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFAPPLICATIONID")
    private String cfapplicationid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFBIRTHDATE")
    private Date cfbirthdate;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFSEMENNUMBERID")
    private String cfsemennumberid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFNOTE")
    private String cfnote;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFEARNUMBERID")
    private String cfearnumberid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFENDDATE")
    private Date cfenddate;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFZHUSHEID")
    private String cfzhusheid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFDOSEID")
    private String cfdoseid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFCOMPLETESTATUSID")
    private String cfcompletestatusid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFSHELFDATE")
    private Long cfshelfdate;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFSHCHANLINEID")
    private String cfshchanlineid;

    /**
     * 
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    @Column(name = "CFSOURCEORGUNITID")
    private String cfsourceorgunitid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CT_PIG_SPERMALLOTRECORD
     *
     * @mbg.generated Wed Jan 13 16:34:34 CST 2021
     */
    private static final long serialVersionUID = 1L;
}