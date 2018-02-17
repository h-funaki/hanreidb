/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.base.mailtemplate;

import javax.validation.constraints.NotNull;

import org.eclipse.collections.api.list.ImmutableList;

import tech.law.hanreidb.app.base.web.response.result.ContentResult;

/**
 * テンプレート固有の導出パラメータ。
 *
 * 送信するメール種別ごとに固有のパラメータを受け取るため、
 * どんなパラメータがあるのかパラメータ名を返す。
 *
 * @author mito
 */
public class ManagedMailDerivedParameterContentResult implements ContentResult {

    /** 導出パラメータ名 */
    @NotNull
    public ImmutableList<String> name_list;
}