package MySQL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "教师", schema = "老师课程表", catalog = "")
public class 教师Entity {
    private int 教师编号;
    private String 教师姓名;

    @Id
    @Column(name = "教师编号")
    public int get教师编号() {
        return 教师编号;
    }

    public void set教师编号(int 教师编号) {
        this.教师编号 = 教师编号;
    }

    @Basic
    @Column(name = "教师姓名")
    public String get教师姓名() {
        return 教师姓名;
    }

    public void set教师姓名(String 教师姓名) {
        this.教师姓名 = 教师姓名;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        教师Entity 教师Entity = (教师Entity) o;
        return 教师编号 == 教师Entity.教师编号 &&
                Objects.equals(教师姓名, 教师Entity.教师姓名);
    }

    @Override
    public int hashCode() {
        return Objects.hash(教师编号, 教师姓名);
    }
}
