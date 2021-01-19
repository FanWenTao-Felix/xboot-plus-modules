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
 * @TableName CT_PIG_SEMENDISTRIBUTION
 */
@Table(name="CT_PIG_SEMENDISTRIBUTION")
@TableName("CT_PIG_SEMENDISTRIBUTION")
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@ApiModel("精液发放记录")
public class CtPigSemendistribution implements Serializable {
    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "FID")
    private String fid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "FCREATORID")
    private String fcreatorid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "FCREATETIME")
    private Date fcreatetime;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "FLASTUPDATEUSERID")
    private String flastupdateuserid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "FLASTUPDATETIME")
    private Date flastupdatetime;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "FCONTROLUNITID")
    private String fcontrolunitid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "FNUMBER")
    private String fnumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "FBIZDATE")
    private Date fbizdate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "FHANDLERID")
    private String fhandlerid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "FDESCRIPTION")
    private String fdescription;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "FHASEFFECTED")
    private Long fhaseffected;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "FAUDITORID")
    private String fauditorid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "FSOURCEBILLID")
    private String fsourcebillid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "FSOURCEFUNCTION")
    private String fsourcefunction;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "FFIVOUCHERED")
    private Long ffivouchered;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFORGUNITID")
    private String cforgunitid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFWEEKHAO")
    private String cfweekhao;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFAPPLICATIONRECOR")
    private String cfapplicationrecor;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFCOMPLETESTATUSID")
    private String cfcompletestatusid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFGENETICSID")
    private String cfgeneticsid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFSHCHANLINEID")
    private String cfshchanlineid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFZHUSHEID")
    private String cfzhusheid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFEARNUMBERID")
    private String cfearnumberid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFBATCHNUMBER")
    private String cfbatchnumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFSEMENNUMBERID")
    private String cfsemennumberid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFBIRTHDATE")
    private Date cfbirthdate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFENDDATE")
    private Date cfenddate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFSHELF")
    private Long cfshelf;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFDOSEID")
    private String cfdoseid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFNOTE")
    private String cfnote;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFIFAUDITING")
    private Long cfifauditing;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    @Column(name = "CFAUDITUSERID")
    private String cfaudituserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CT_PIG_SEMENDISTRIBUTION
     *
     * @mbg.generated Mon Jan 18 10:15:24 CST 2021
     */
    private static final long serialVersionUID = 1L;
}