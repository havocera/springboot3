package cc.jiaotu.jpatest.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "paper_question", schema = "exam", catalog = "")
public class PaperQuestionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "paper_id")
    private Integer paperId;
    @Basic
    @Column(name = "question_id")
    private Integer questionId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "type")
    private Byte type;
    @Basic
    @Column(name = "options")
    private String options;
    @Basic
    @Column(name = "answer")
    private String answer;
    @Basic
    @Column(name = "analysis")
    private String analysis;
    @Basic
    @Column(name = "keyword")
    private String keyword;
    @Basic
    @Column(name = "keyword_imp")
    private String keywordImp;
    @Basic
    @Column(name = "score")
    private Double score;
    @Basic
    @Column(name = "order")
    private Integer order;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "update_time")
    private Timestamp updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaperQuestionEntity that = (PaperQuestionEntity) o;
        return id == that.id && Objects.equals(paperId, that.paperId) && Objects.equals(questionId, that.questionId) && Objects.equals(name, that.name) && Objects.equals(title, that.title) && Objects.equals(type, that.type) && Objects.equals(options, that.options) && Objects.equals(answer, that.answer) && Objects.equals(analysis, that.analysis) && Objects.equals(keyword, that.keyword) && Objects.equals(keywordImp, that.keywordImp) && Objects.equals(score, that.score) && Objects.equals(order, that.order) && Objects.equals(createTime, that.createTime) && Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, paperId, questionId, name, title, type, options, answer, analysis, keyword, keywordImp, score, order, createTime, updateTime);
    }
}
