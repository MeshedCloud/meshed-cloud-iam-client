package cn.meshed.cloud.iam.account.query;

import com.alibaba.cola.dto.Query;
import lombok.Data;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class AccountByIdQry extends Query {
    /**
     * 账号ID
     */
    private Long id;
}