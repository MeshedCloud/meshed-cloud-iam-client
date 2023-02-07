package cn.meshed.cloud.iam.dto.account.data;

import com.alibaba.cola.dto.DTO;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class AccountDTO extends DTO {

    /**
     * ID
     */
    private Long id;

    /**
     * 账号登入主名称
     */
    private String loginId;

    /**
     * 账号手机号
     */
    private String phone;

    /**
     * 账号邮箱
     */
    private String email;

    /**
     * 账号手机号是否有效
     */
    private Boolean validPhone;

    /**
     * 账号有效是否有效
     */
    private Boolean validEmail;

    /**
     * 账号加密后的密码
     */
    private String secretKey;

    /**
     * 是否过期
     */
    private Boolean expired;

    /**
     * 是否锁定
     */
    private Boolean locked;

    /**
     * 权限集合
     */
    private Set<String> grantedAuthority;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}
