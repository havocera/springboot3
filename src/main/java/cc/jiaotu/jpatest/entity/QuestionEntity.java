package cc.jiaotu.jpatest.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "question", schema = "exam", catalog = "")
public class QuestionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "major_id")
    private Integer majorId;
    @Basic
    @Column(name = "course_id")
    private Integer courseId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "type")
    private Byte type;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "analysis")
    private String analysis;
    @Basic
    @Column(name = "options")
    private String options;
    @Basic
    @Column(name = "answer")
    private String answer;
    @Basic
    @Column(name = "keyword")
    private String keyword;
    @Basic
    @Column(name = "keyword_imp")
    private String keywordImp;
    @Basic
    @Column(name = "status")
    private Integer status;
    @Basic
    @Column(name = "score")
    private Integer score;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "update_time")
    private Timestamp updateTime;
    @Basic
    @Column(name = "order")
    private Integer order;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeywordImp() {
        return keywordImp;
    }

    public void setKeywordImp(String keywordImp) {
        this.keywordImp = keywordImp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionEntity that = (QuestionEntity) o;
        return id == that.id && Objects.equals(majorId, that.majorId) && Objects.equals(courseId, that.courseId) && Objects.equals(name, that.name) && Objects.equals(type, that.type) && Objects.equals(title, that.title) && Objects.equals(analysis, that.analysis) && Objects.equals(options, that.options) && Objects.equals(answer, that.answer) && Objects.equals(keyword, that.keyword) && Objects.equals(keywordImp, that.keywordImp) && Objects.equals(status, that.status) && Objects.equals(score, that.score) && Objects.equals(createTime, that.createTime) && Objects.equals(updateTime, that.updateTime) && Objects.equals(order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, majorId, courseId, name, type, title, analysis, options, answer, keyword, keywordImp, status, score, createTime, updateTime, order);
    }
}
