package MySQL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "课程", schema = "老师课程表", catalog = "")
public class 课程Entity {
    private int 课程编号;
    private String 课程名称;

    @Id
    @Column(name = "课程编号")
    public int get课程编号() {
        return 课程编号;
    }

    public void set课程编号(int 课程编号) {
        this.课程编号 = 课程编号;
    }

    @Basic
    @Column(name = "课程名称")
    public String get课程名称() {
        return 课程名称;
    }

    public void set课程名称(String 课程名称) {
        this.课程名称 = 课程名称;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        课程Entity 课程Entity = (课程Entity) o;
        return 课程编号 == 课程Entity.课程编号 &&
                Objects.equals(课程名称, 课程Entity.课程名称);
    }

    @Override
    public int hashCode() {
        return Objects.hash(课程编号, 课程名称);
    }
}
