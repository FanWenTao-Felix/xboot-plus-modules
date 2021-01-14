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
 * @TableName T_BD_PERSON
 */
@Table(name="T_BD_PERSON")
@TableName("T_BD_PERSON")
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@ApiModel(value = "职员信息")
public class TBdPerson implements Serializable {
    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "FID")
    private String fid;

    /**
     * 助记码
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FIDNUM")
    private String fidnum;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FNAME_L1")
    private String fnameL1;

    /**
     * 名称
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FNAME_L2")
    private String fnameL2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FNAME_L3")
    private String fnameL3;

    /**
     * 编码
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FNUMBER")
    private String fnumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FDESCRIPTION_L1")
    private String fdescriptionL1;

    /**
     * 描述
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FDESCRIPTION_L2")
    private String fdescriptionL2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FDESCRIPTION_L3")
    private String fdescriptionL3;

    /**
     * 简称
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FSIMPLENAME")
    private String fsimplename;

    /**
     * 性别
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FGENDER")
    private Long fgender;

    /**
     * 出生日期
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FBIRTHDAY")
    private Date fbirthday;

    /**
     * 电子邮件
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FEMAIL")
    private String femail;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FADDRESS_L1")
    private String faddressL1;

    /**
     * 通信地址
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FADDRESS_L2")
    private String faddressL2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FADDRESS_L3")
    private String faddressL3;

    /**
     * 审核状态
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FSTATE")
    private Long fstate;

    /**
     * 家庭电话
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FHOMEPHONE")
    private String fhomephone;

    /**
     * 办公室电话
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FOFFICEPHONE")
    private String fofficephone;

    /**
     * 手机号码
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FCELL")
    private String fcell;

    /**
     * 备用手机号码
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FBACKUPCELL")
    private String fbackupcell;

    /**
     * 备用电子邮件
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FBACKUPEMAIL")
    private String fbackupemail;

    /**
     * RTX号码
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FRTX")
    private String frtx;

    /**
     * 身份证号码
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FIDCARDNO")
    private String fidcardno;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FIDCARDADRESS_L1")
    private String fidcardadressL1;

    /**
     * 身份证地址
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FIDCARDADRESS_L2")
    private String fidcardadressL2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FIDCARDADRESS_L3")
    private String fidcardadressL3;

    /**
     * 护照号码
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FPASSPORTNO")
    private String fpassportno;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FOLDNAME_L1")
    private String foldnameL1;

    /**
     * 曾用名
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FOLDNAME_L2")
    private String foldnameL2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FOLDNAME_L3")
    private String foldnameL3;

    /**
     * 身高
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FHEIGHT")
    private Long fheight;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FNATIVEPLACE_L1")
    private String fnativeplaceL1;

    /**
     * 籍贯
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FNATIVEPLACE_L2")
    private String fnativeplaceL2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FNATIVEPLACE_L3")
    private String fnativeplaceL3;

    /**
     * 血型
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FBLOODTYPE")
    private Long fbloodtype;

    /**
     * 创建者
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FCREATORID")
    private String fcreatorid;

    /**
     * 创建时间
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FCREATETIME")
    private Date fcreatetime;

    /**
     * 最后修改者
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FLASTUPDATEUSERID")
    private String flastupdateuserid;

    /**
     * 最后修改时间
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FLASTUPDATETIME")
    private Date flastupdatetime;

    /**
     * 记帐分类
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FKACLASSFICATIONID")
    private String fkaclassficationid;

    /**
     * 婚姻状况
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FWEDID")
    private String fwedid;

    /**
     * 健康状况
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FHEALTHID")
    private String fhealthid;

    /**
     * 政治面貌
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FPOLITICALFACEID")
    private String fpoliticalfaceid;

    /**
     * 个人成份
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FSTANDINGID")
    private String fstandingid;

    /**
     * 民族
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FFOLKID")
    private String ffolkid;

    /**
     * 家庭出身
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FBIRTHID")
    private String fbirthid;

    /**
     * 控制单元
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FCONTROLUNITID")
    private String fcontrolunitid;

    /**
     * HR组织
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FHRORGUNITID")
    private String fhrorgunitid;

    /**
     * 居住地址
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FRESIDENCEPLACE")
    private String fresidenceplace;

    /**
     * 实际工龄
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FLENOFACTUALSERVICE")
    private Long flenofactualservice;

    /**
     * 员工状态
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FEMPLOYEETYPEID")
    private String femployeetypeid;

    /**
     * 最高职称
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FHIGHESTTECHPOSTID")
    private String fhighesttechpostid;

    /**
     * 最高学历
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FHIGHESTDEGREEID")
    private String fhighestdegreeid;

    /**
     * 人员类型
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FEMPLOYEECLASSIFYID")
    private String femployeeclassifyid;

    /**
     * 失效状态
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FDELETEDSTATUS")
    private Long fdeletedstatus;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FLCMRATIONLEVELID")
    private String flcmrationlevelid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FNATIONALITYID")
    private String fnationalityid;

    /**
     * 检查状态
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FCHECKSTATE")
    private Long fcheckstate;

    /**
     * 顺序号
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FINDEX")
    private Long findex;

    /**
     * 公司聘任职称
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FEMPLOYTECHPOSTID")
    private String femploytechpostid;

    /**
     * 最高学位
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FHIGHESTSUBDEGREEID")
    private String fhighestsubdegreeid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY1")
    private String fzdy1;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY2")
    private String fzdy2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY3")
    private String fzdy3;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY4")
    private String fzdy4;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY5")
    private String fzdy5;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY6")
    private String fzdy6;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY7")
    private String fzdy7;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY8")
    private String fzdy8;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY9")
    private Date fzdy9;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY10")
    private Date fzdy10;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY11")
    private Date fzdy11;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY12")
    private Date fzdy12;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY13")
    private Date fzdy13;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY14")
    private Date fzdy14;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY15")
    private String fzdy15;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY16")
    private String fzdy16;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY17")
    private String fzdy17;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY18")
    private BigDecimal fzdy18;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY19")
    private BigDecimal fzdy19;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY20")
    private Long fzdy20;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY21")
    private Long fzdy21;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY22")
    private String fzdy22;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY23")
    private String fzdy23;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY24")
    private String fzdy24;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY25")
    private String fzdy25;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FZDY26")
    private Long fzdy26;

    /**
     * 姓名全拼
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FFULLNAMEPINGYIN")
    private String ffullnamepingyin;

    /**
     * 姓名简拼
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FSIMPLENAMEPINGYIN")
    private String fsimplenamepingyin;

    /**
     * 是否后备人才
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FISSTANDBY")
    private Long fisstandby;

    /**
     * 是否干部
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FISSTANDBYCADRE")
    private Long fisstandbycadre;

    /**
     * 最高职业资格
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FHIGHESTCOMPETENCYID")
    private String fhighestcompetencyid;

    /**
     * 名称拼音
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FNAMEPINYIN")
    private String fnamepinyin;

    /**
     * 名称简拼
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FNAMESHORTPINYIN")
    private String fnameshortpinyin;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FREGRESIDENCEID")
    private String fregresidenceid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FHJADDRESS")
    private String fhjaddress;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FIDCARDADDRESS")
    private String fidcardaddress;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FHOMEPLACE")
    private String fhomeplace;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FEFFDT")
    private Date feffdt;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FLEFFDT")
    private Date fleffdt;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FHISTORYRELATEID")
    private String fhistoryrelateid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FIDCARDBEGINDATE")
    private Date fidcardbegindate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FIDCARDENDDATE")
    private Date fidcardenddate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FEXTENDFIELDNUMONE")
    private String fextendfieldnumone;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FPROTOCOL")
    private String fprotocol;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FIDCARDISSUEORG")
    private String fidcardissueorg;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "FGKADMIN")
    private String fgkadmin;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "CFRELIGIONID")
    private String cfreligionid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "CFPERSONCITYID")
    private String cfpersoncityid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    @Column(name = "CFPROVINCE")
    private String cfprovince;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_BD_PERSON
     *
     * @mbg.generated Mon Jan 11 08:54:49 CST 2021
     */
    private static final long serialVersionUID = 1L;
}