package commonModule;

/**
 * @author zhanglbjames@163.com
 * @version Created on 17-12-8.
 */
public class ObjectProp {
    private static String group = "zss";
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ObjectProp(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
