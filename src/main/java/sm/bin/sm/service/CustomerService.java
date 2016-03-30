package sm.bin.sm.service;
import sm.bin.sm.model.Customer;

import java.util.Map;
import java.util.List;

public class CustomerService {
    /***
     * 获取客户数据
     */
    public List<Customer> getCustomerList(String kw) {
        return null;
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id) {
        return null;
    }

    /**
     * 添加客户
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return false;
    }

    /**
     * 更新用户
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return false;
    }

    public boolean deleteCustomer(long id) {
        // FIXME
        return false;
    }
}