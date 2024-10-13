package cn.lkh.welldine.model;

import lombok.Data;

/**
 * 食品添加剂
 *
 * 成分
 * 作用
 * 潜在风险
 * 专业评审
 * 标签
 */
@Data
public class Additive {
    private String name;
    private String effect;
    private String risk;
    private String pro_review;
    private String tag;
}
