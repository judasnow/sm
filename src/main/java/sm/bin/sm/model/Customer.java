package sm.bin.sm.model;

/***
 * 客户
 */

public class Customer {
    private long id;
    private String name;
    private String contact;
    private String email;
    private String remark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}