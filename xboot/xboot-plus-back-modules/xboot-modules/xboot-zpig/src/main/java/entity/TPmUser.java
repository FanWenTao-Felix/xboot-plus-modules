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
 * @TableName T_PM_USER
 */
@Table(name="T_PM_USER")
@TableName("T_PM_USER")
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@ApiModel(value = "用户")
public class TPmUser implements Serializable {
    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "FID")
    private String fid;

    /**
     * 用户名
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FNUMBER")
    private String fnumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FNAME_L1")
    private String fnameL1;

    /**
     * 用户实名
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FNAME_L2")
    private String fnameL2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FNAME_L3")
    private String fnameL3;

    /**
     * 用户类型
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FTYPE")
    private Long ftype;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FDESCRIPTION_L1")
    private String fdescriptionL1;

    /**
     * 描述
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FDESCRIPTION_L2")
    private String fdescriptionL2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FDESCRIPTION_L3")
    private String fdescriptionL3;

    /**
     * 密码
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FPASSWORD")
    private String fpassword;

    /**
     * 是否是已经删除
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FISDELETE")
    private Long fisdelete;

    /**
     * 是否锁定
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FISLOCKED")
    private Long fislocked;

    /**
     * 是否禁用
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FFORBIDDEN")
    private Long fforbidden;

    /**
     * 生效时间
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FEFFECTIVEDATE")
    private Date feffectivedate;

    /**
     * 失效时间
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FINVALIDATIONDATE")
    private Date finvalidationdate;

    /**
     * 缺省使用语言
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FDEFAULTLOCALE")
    private String fdefaultlocale;

    /**
     * 是否注册
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FISREGISTER")
    private Long fisregister;

    /**
     * 登录错误次数
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FERRCOUNT")
    private Long ferrcount;

    /**
     * 所属用户组
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FGROUPID")
    private String fgroupid;

    /**
     * 对应的操作人
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FPERSONID")
    private String fpersonid;

    /**
     * 密码策略
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FSECURITYID")
    private String fsecurityid;

    /**
     * 密码生效日期
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FPWEFFECTIVEDATE")
    private Date fpweffectivedate;

    /**
     * 用户锁定时间
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FLOCKEDTIME")
    private Date flockedtime;

    /**
     * 是否为业务管理员
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FISBIZADMIN")
    private Long fisbizadmin;

    /**
     * 是否修改过密码
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FISCHANGEDPW")
    private Long fischangedpw;

    /**
     * 缺省组织
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FDEFORGUNITID")
    private String fdeforgunitid;

    /**
     * 控制单元
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FCONTROLUNITID")
    private String fcontrolunitid;

    /**
     * 创建者
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FCREATORID")
    private String fcreatorid;

    /**
     * 创建时间
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FCREATETIME")
    private Date fcreatetime;

    /**
     * 最后修改者
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FLASTUPDATEUSERID")
    private String flastupdateuserid;

    /**
     * 最后修改时间
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FLASTUPDATETIME")
    private Date flastupdatetime;

    /**
     * 客户id
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FCUSTOMERID")
    private String fcustomerid;

    /**
     * 供应商id
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FSUPPLIERID")
    private String fsupplierid;

    /**
     * 主角色
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FMAINROLEID")
    private String fmainroleid;

    /**
     * 代理用户
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FAGENTUSER")
    private Long fagentuser;

    /**
     * 登陆认证方式
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FLOGINAUTHORWAY")
    private Long floginauthorway;

    /**
     * 历史密码
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FPWDHISSTR")
    private String fpwdhisstr;

    /**
     * 引用id
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FREFERID")
    private String freferid;

    /**
     * 手机号码
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FCELL")
    private String fcell;

    /**
     * 备用电子邮件
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FBACKUPEMAIL")
    private String fbackupemail;

    /**
     * 家庭电话
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FHOMEPHONE")
    private String fhomephone;

    /**
     * 办公室电话
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FOFFICEPHONE")
    private String fofficephone;

    /**
     * 电子邮件
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FEMAIL")
    private String femail;

    /**
     * AD账号
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FADNUMBER")
    private String fadnumber;

    /**
     * 姓名全拼
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FNAMEPINYIN")
    private String fnamepinyin;

    /**
     * 姓名简拼
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FNAMESHORTPINYIN")
    private String fnameshortpinyin;

    /**
     * 全拼
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FPINYIN")
    private String fpinyin;

    /**
     * 简拼
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FSHORTPINYIN")
    private String fshortpinyin;

    /**
     * 是否是认证管理员
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FISAUTHENADMIN")
    private Long fisauthenadmin;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FISACTIVATE")
    private Long fisactivate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FUID")
    private String fuid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FISSYNTOCLOUD")
    private Long fissyntocloud;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FPOSID")
    private String fposid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    @Column(name = "FERPUSERSTATUS")
    private Long ferpuserstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_PM_USER
     *
     * @mbg.generated Mon Jan 11 09:29:21 CST 2021
     */
    private static final long serialVersionUID = 1L;
}