package cc.jiaotu.jpatest.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "exam", schema = "exam", catalog = "")
public class ExamEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "course_id")
    private Integer courseId;
    @Basic
    @Column(name = "course_name")
    private String courseName;
    @Basic
    @Column(name = "major_id")
    private Integer majorId;
    @Basic
    @Column(name = "major_name")
    private String majorName;
    @Basic
    @Column(name = "paper_id")
    private Integer paperId;
    @Basic
    @Column(name = "rule")
    private String rule;
    @Basic
    @Column(name = "focus")
    private String focus;
    @Basic
    @Column(name = "start_date")
    private Timestamp startDate;
    @Basic
    @Column(name = "max_end_date")
    private Timestamp maxEndDate;
    @Basic
    @Column(name = "time")
    private Integer time;
    @Basic
    @Column(name = "is_analysis")
    private Byte isAnalysis;
    @Basic
    @Column(name = "is_check")
    private Byte isCheck;
    @Basic
    @Column(name = "status")
    private byte status;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "update_time")
    private Timestamp updateTime;
    @Basic
    @Column(name = "img")
    private String img;
    @Basic
    @Column(name = "count")
    private Integer count;
    @Basic
    @Column(name = "score")
    private int score;
    @Basic
    @Column(name = "state")
    private byte state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getFocus() {
        return focus;
    }

    public void setFocus(String focus) {
        this.focus = focus;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getMaxEndDate() {
        return maxEndDate;
    }

    public void setMaxEndDate(Timestamp maxEndDate) {
        this.maxEndDate = maxEndDate;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Byte getIsAnalysis() {
        return isAnalysis;
    }

    public void setIsAnalysis(Byte isAnalysis) {
        this.isAnalysis = isAnalysis;
    }

    public Byte getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Byte isCheck) {
        this.isCheck = isCheck;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamEntity that = (ExamEntity) o;
        return id == that.id && status == that.status && score == that.score && state == that.state && Objects.equals(title, that.title) && Objects.equals(courseId, that.courseId) && Objects.equals(courseName, that.courseName) && Objects.equals(majorId, that.majorId) && Objects.equals(majorName, that.majorName) && Objects.equals(paperId, that.paperId) && Objects.equals(rule, that.rule) && Objects.equals(focus, that.focus) && Objects.equals(startDate, that.startDate) && Objects.equals(maxEndDate, that.maxEndDate) && Objects.equals(time, that.time) && Objects.equals(isAnalysis, that.isAnalysis) && Objects.equals(isCheck, that.isCheck) && Objects.equals(createTime, that.createTime) && Objects.equals(updateTime, that.updateTime) && Objects.equals(img, that.img) && Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, courseId, courseName, majorId, majorName, paperId, rule, focus, startDate, maxEndDate, time, isAnalysis, isCheck, status, createTime, updateTime, img, count, score, state);
    }
}
