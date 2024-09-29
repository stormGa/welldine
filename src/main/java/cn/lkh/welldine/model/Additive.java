package cn.lkh.welldine.model;

/**
 * 食品添加剂
 *
 * 成分
 * 作用
 * 潜在风险
 * 专业评审
 * 标签
 */
public class Additive {
    private String name;
    private String effect;
    private String risk;
    private String pro_review;
    private String tag;

    @Override
    public String toString() {
        return "Additive{" +
                "name='" + name + '\'' +
                ", effect='" + effect + '\'' +
                ", risk='" + risk + '\'' +
                ", pro_review='" + pro_review + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getPro_review() {
        return pro_review;
    }

    public void setPro_review(String pro_review) {
        this.pro_review = pro_review;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
