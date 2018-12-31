package cn.hutool.extra.tokenizer;

import cn.hutool.extra.tokenizer.engine.EngineFactory;

/**
 * 分词工具类
 * 
 * @author looly
 * @since 4.3.3
 */
public class TokenizerUtil {

	/**
	 * 根据用户引入的分词引擎jar，自动创建对应的分词引擎对象
	 * 
	 * @param config 分词配置，包括编码、分词文件path等信息
	 * @return {@link Engine}
	 */
	public static Engine createEngine() {
		return EngineFactory.create();
	}
}
