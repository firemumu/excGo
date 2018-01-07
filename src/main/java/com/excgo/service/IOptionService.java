package com.excgo.service;

import java.util.List;
import java.util.Map;

import com.excgo.modal.Vo.OptionVo;

/**
 * options的接口
 */
public interface IOptionService {

    void insertOption(OptionVo optionVo);

    void insertOption(String name, String value);

    List<OptionVo> getOptions();

    /**
     * 保存一组配置
     *
     * @param options
     */
    void saveOptions(Map<String, String> options);

    OptionVo getOptionByName(String name);
}
