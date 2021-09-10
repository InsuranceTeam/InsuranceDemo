package com.example.demo.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Item {
    private Long id;

    @NotBlank(message="氏名（カナ）を入力してください。")
    private String nameKana;

    @NotBlank(message="保障内容を入力してください。")
    private String hosyoNaiyo;

    //@NotBlank(message="保険金を入力してください。")
    @Min(value=100, message="100万円以上の金額を入力してください。")
    @Max(value=1000, message="1000万円以下の金額を入力してください。")
    //ニューメリックチェックは別途実施する必要あり。（今回は未実装にしました・・・）
    private int hokenkin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameKana() {
        return nameKana;
    }

    public void setNameKana(String nameKana) {
        this.nameKana = nameKana;
    }

    public String getHosyoNaiyo() {
        return hosyoNaiyo;
    }

    public void setHosyoNaiyo(String hosyoNaiyo) {
        this.hosyoNaiyo = hosyoNaiyo;
    }

    public int getHokenkin() {
        return hokenkin;
    }

    public void setHokenkin(int hokenkin) {
        this.hokenkin = hokenkin;
    }

}
