package cn.meshed.cloud.iam.account.data;

import com.alibaba.cola.dto.DTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author by Vincent Vic
 * @since 2022-10-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GrantedAuthorityDTO extends DTO {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 父权限
     */
    private Long parentId;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限英文名称
     */
    private String enname;

    /**
     * 授权路径
     */
    private String uri;

    /**
     * 备注
     */
    private String description;


}
