package cn.hutool.extra.tokenizer.engine.hanlp;

import com.hankcs.hanlp.seg.common.Term;

import cn.hutool.extra.tokenizer.Word;

/**
 * HanLP分词中的一个单词包装
 * 
 * @author looly
 *
 */
public class HanLPWord implements Word {
	
	private Term term;

	/**
	 * 构造
	 * 
	 * @param term {@link Term}
	 */
	public HanLPWord(Term term) {
		this.term = term;
	}

	@Override
	public String getText() {
		return term.word;
	}

	@Override
	public String toString() {
		return getText();
	}
}
