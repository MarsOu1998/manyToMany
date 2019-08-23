package MySQL;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "教师任课表", schema = "老师课程表", catalog = "")
public class 教师任课表Entity {
    private int 教师编号;
    private int 课程编号;

    @Basic
    @Column(name = "教师编号")
    public int get教师编号() {
        return 教师编号;
    }

    public void set教师编号(int 教师编号) {
        this.教师编号 = 教师编号;
    }

    @Basic
    @Column(name = "课程编号")
    public int get课程编号() {
        return 课程编号;
    }

    public void set课程编号(int 课程编号) {
        this.课程编号 = 课程编号;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        教师任课表Entity that = (教师任课表Entity) o;
        return 教师编号 == that.教师编号 &&
                课程编号 == that.课程编号;
    }

    @Override
    public int hashCode() {
        return Objects.hash(教师编号, 课程编号);
    }
}
