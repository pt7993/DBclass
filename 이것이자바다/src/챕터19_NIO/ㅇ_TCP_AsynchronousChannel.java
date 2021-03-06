package 矇攪19_NIO;

public class 仄_TCP_AsynchronousChannel {
	// NIO朝 TCP 綰煎韁, 凱綰煎韁 瓣割 檜諼縑 TCP 綠翕晦 瓣割煎, AsynchronousServerSocketChannel婁 AsynchronousSocketChannel擊 薯奢и棻.
	// 陝陝 ServerSocketChannel婁 SocketChannel縑 渠擬ж朝 贗楚蝶煎 NIO曖 爾戮偽擎 贗楚蝶檜棻. 舒 贗楚蝶曖 餌辨 寞徹擊 憲嬴爾晦煎 ж濠.
	
			//	Characteristic Of Asynchronous Channel
	
	// TCP 綠翕晦 瓣割擎 翱唸 蹂羶(connect()), 翱唸 熱塊(accept()), 檗晦(read()), 噙晦(write())蒂 ��轎ж賊 闊衛 葬欐и棻..
	// 檜匙擎 凱綰煎韁 寞衝婁 翕橾ж棻. 離檜薄擎 檜 詭模萄菟擊 ��轎ж賊 蝶溯萄ヴ縑啪 濛機 籀葬 蹂羶ж堅 檜 詭模萄菟擎 闊衛 葬欐脹棻. 褒韓瞳檣 濛機 籀葬朝 蝶溯萄ヴ曖 濛機 蝶溯萄陛 氬渡и棻.
	// 濛機 蝶溯萄陛 濛機擊 諫猿ж啪 腎賊 屬寥(callback) 詭模萄陛 濠翕 ��轎腎晦 陽僥縑 濛機 諫猿 �� 褒чп撿 й 囀萄陛 氈棻賊 屬寥 詭模萄縑憮 濛撩ж賊 脹棻.
	
	//	忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖
	//	弛 綠翕晦 籀葬 寞衝																	弛
	//	弛	|																			弛
	//	弛	| 1 accept() 忙式式式式式式忖				忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖	弛
	//	弛	|式式式式式式式式式式⊥ 弛 綠翕晦	弛	3 濛機 籀葬		弛蝶溯萄ヴ			忙式式式式式式式式式式式忖 忖		弛	弛
	//	弛	|∠式式式式式式式式式式 弛  瓣割	﹥式式式忖 蹂羶		弛				弛	蝶溯萄 1	弛 弛		弛	弛
	//	弛	|	2 闊衛 葬欐    戌式式式式式式戎	弛			弛			 忙⊥	弛  5 濛機 籀葬	弛 弛 譆	弛	弛
	//	弛	|∠式式式式式式式式式式式式式 蝶溯萄 1	弛			弛	4 濛機 聽	 弛	弛	  ﹥		弛 弛 渠	弛	弛
	//	弛	| 6 屬寥 詭模萄 ��轎			弛			弛	忙式式式式式式式忖戎	戌式式式式式式式式式式式戎 弛 偃	弛	弛
	//	弛	| 6 屬寥 詭模萄 ��轎			﹥式式式式式式式式式式式式式⊥	弛 ﹥ ﹥ ﹥	弛	忙式式式式式式式式式式式忖 弛 熱	弛	弛
	//	弛	|∠式式式式式式式式式式式式式	蝶溯萄 2	弛			弛	戌式式式式式式式戎式⊥	弛	蝶溯萄 2	弛 弛  	弛	弛
	//	弛	|1 read/write() 忙式式式式忖	弛			弛	陝 蝶溯萄朝 聽縑憮	弛  5 濛機 籀葬	弛 弛 薯	弛	弛
	//	弛	|式式式式式式式式式式⊥ 	弛綠翕晦弛	弛			弛濛機擊 陛螳諦 褒ч衛霽	弛	  ﹥		弛 弛 и	弛	弛
	//	弛	|∠式式式式式式式式式式 	弛瓣割	 ﹥式式戎		蹂羶	弛				戌式式式式式式式式式式式戎 弛		弛	弛
	//	弛	|	2 闊衛 葬欐	 	戌式式式式戎		3 濛機 籀葬	弛					  :		  弛		弛	弛
	//	弛	⊿									弛					蝶溯萄 n	  戎		弛	弛
	//	弛										戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎	弛
	//	戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎
	
	// 斜葡擊 覬 渦 欽牖�亳藥� 檜пп爾濠. 擁Ы葬馨檜暮縑憮 read() 詭模萄蒂 ��轎ж賊 闊衛 葬欐腎雖虜, 褒韓瞳戲煎 頂睡縑憮朝 蝶溯萄ヴ曖 濛機 蝶溯萄陛 read() 詭模萄蒂 褒чи棻.
	// 濛機 蝶溯萄陛 read() 詭模萄蒂 賅舒 褒чж堅 釭賊 屬寥 詭模萄檣 completed() 詭模萄陛 濠翕 ��轎脹棻. 檜陽 completed() 詭模萄蒂 褒чж朝 蝶溯萄朝 蝶溯萄ヴ曖 濛機 蝶溯萄檜棻.
	
	//
	//										忙式式式式式式式式式式式式式式式式式式式式式式式式式式式忖
	//										弛	蝶溯萄ヴ(ExecutorService)	弛
	//		忙式式式式式式式式式式式忖	2 read() ��轎		弛		濛機 蝶溯萄				弛
	//		弛 1 褒ч	弛---------------------------⊥忙式式式式式式式式式式式式式式忖		弛
	//		弛		⊿∠---------------------------弛 read() {		弛		弛
	//		戌式式式式式式式式式式式戎	闊衛 葬欐			弛	 弛		弛		弛		弛
	//										弛	 弛		弛		弛		弛
	//										弛	 弛		弛 3 褒ч	弛		弛
	//		忙式式式式式式式式式式式式式式式式式式式忖			弛	 弛		弛		弛		弛
	//		弛 completed() 詭模萄	弛			弛	 弛		弛		弛		弛
	//		弛  5 褒ч	忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式⊿		弛		弛
	//		弛		⊿			弛			弛	 戌式式式式式式式式式式式式式式戎		弛
	//		戌式式式式式式式式式式式式式式式式式式式戎			戌式式式式式式式式式式式式式式式式式式式式式式式式式式式戎
	
			// Asynchronous Channel Group		綠翕晦 瓣割 斜瑜
	
	// 綠翕晦 憮幗模鰍 瓣割(AsynchronousServerSocketChannel)婁 綠翕晦 模鰍 瓣割(AsynchronousSocketChannel)擊 髦よ爾晦 瞪縑 
	// 辦摹 綠翕晦 瓣割 斜瑜(AsynchronousChannelGroup)縑 渠п憮 檜пп爾濠. 綠翕晦 瓣割 斜瑜擎 偽擎 蝶溯萄ヴ擊 奢嶸ж朝 綠翕晦 瓣割菟曖 僮擠檜塭堅 獐 熱 氈棻.
	// ж釭曖 蝶溯萄ヴ擊 餌辨и棻賊 賅萇 綠翕晦 瓣割擎 偽擎 瓣割 斜瑜縑 樓п撿 и棻.
	
	//	忙式式式式式式式式  綠翕晦 瓣割 斜瑜  式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖
	//	弛	(AsynchronousChannelGroup)															弛
	//	弛												蝶溯萄ヴ(ExecutorService)					弛
	//	弛												忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖	弛
	//	弛							翱唸 蹂羶				弛				忙式式式式式式式式式式式忖 忖		弛	弛
	//	弛AsynchronousServerSocketChannel﹥式式式忖 熱塊		弛				弛	蝶溯萄 1	弛 弛		弛	弛
	//	弛									弛			弛			 忙⊥	弛 翱唸 熱塊 籀葬	弛 弛 譆	弛	弛
	//	弛	AsynchronousSocketChannel		弛			弛	   濛機 聽	 弛	弛	  ﹥		弛 弛 渠	弛	弛
	//	弛	 								弛			弛	忙式式式式式式式忖戎	戌式式式式式式式式式式式戎 弛 偃	弛	弛
	//	弛	 								﹥式式式式式式式式式式式式式⊥	弛 ﹥ ﹥ ﹥	弛	忙式式式式式式式式式式式忖 弛 熱	弛	弛
	//	弛				:					弛			弛	戌式式式式式式式戎式⊥	弛	蝶溯萄 2	弛 弛  	弛	弛
	//	弛				:					弛			弛	陝 蝶溯萄朝 聽縑憮	弛 翱唸 熱塊 籀葬	弛 弛 薯	弛	弛
	//	弛									弛			弛濛機擊 陛螳諦 褒ч衛霽	弛	  ﹥		弛 弛 и	弛	弛
	//	弛		AsynchronousSocketChannel﹥式式戎	蹂羶		弛				戌式式式式式式式式式式式戎 弛		弛	弛
	//	弛									   殮轎溘		弛					  :		  弛		弛	弛
	//	弛												弛					蝶溯萄 n	  戎		弛	弛
	//	弛												戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎	弛
	//	戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎
	
	// 綠翕晦 瓣割擊 儅撩й 陽 瓣割 斜瑜擊 雖薑ж雖 彊戲賊 晦獄 綠翕晦 瓣割 斜瑜檜 儅撩脹棻. 晦獄 綠翕晦 瓣割 斜瑜擎 頂睡瞳戲煎 棻擠婁 偽檜 蝶溯萄ヴ擊 儅撩и棻.
	
	//	new ThreadPoolExceutor(
	//		0, Integer.MAX_VALUE,
	//		Long.MAX_VALUE, TimeUnit.MILLISECONDS,
	//		new SynchronousQueue<Runnable>(),
	//		threadFactory);
	
	// 檜煩瞳戲煎 Integer.MAX_VALUE偃虜躑 蝶溯萄陛 隸陛й 熱 氈紫煙 腎橫 氈棻. 
	// ж雖虜 蝶溯萄ヴ擎 渠睡碟 譆渠 蝶溯萄 熱蒂 雖薑п憮 餌辨ж嘎煎 棻擠婁 偽檜 AsynchronousChannelGroup擊 霜蕾 儅撩ж堅 餌辨ж朝 匙檜 橾奩瞳檜棻.
	
	//	AsynchronousChannelGroup channelGroup = AsynchronousChannelGroup.withFixedThreadPool(
	//		譆渠蝶溯萄 熱,
	//		Executors.defaultThreadFactory()
	//	);
	
	// 棻擠擎 CPU 囀橫曖 熱虜躑 蝶溯萄蒂 婦葬ж朝 蝶溯萄ヴ擊 儅撩ж堅 檜匙擊 檜辨ж朝 綠翕晦 瓣割 斜瑜擊 儅撩и棻.
	
	//	AsynchronousChannelGroup channelGroup = AsynchronousChannelGroup.withFixedThreadPool(
	//		Runtime.getRuntime().availableProcessors(),
	//		Executors.defaultThreadFactroy()
	//	);
	
	// 檜溢啪 儅撩脹 綠翕晦 瓣割 斜瑜擎 綠翕晦 瓣割擊 儅撩й 陽 衙偃高戲煎 餌辨脹棻. 綠翕晦 瓣割 斜瑜擊 渦 檜鼻 餌辨ж雖 彊堅 謙猿й 唳辦縑朝 shutdown()婁 shutdownNow() 詭模萄蒂 ��轎й 熱 氈棻.
	
	//	channelGroup.shutdown();
	//	channelGroup.shutdownNow();
	
	// shutdown()擎 綠翕晦 瓣割 斜瑜擊 謙猿ж啊棻朝 曖餌虜 瞪殖й 閨 闊衛 綠翕晦 瓣割 斜瑜擊 謙猿ж雖 彊朝棻. 綠翕晦 瓣割 斜瑜縑 んл脹 賅萇 綠翕晦 瓣割檜 殘�鷒� 綠煎模 瓣割 斜瑜檜 謙猿脹棻.
	// shutdown() 詭模萄蒂 ��轎и 檜�醴� 億煎遴 綠翕晦 瓣割擊 綠翕晦 瓣割 斜瑜縑 んл衛酈賊 ShutdownChannelGroupExceptio檜 嫦儅и棻.
	// shutdown()朝 鬼薯瞳戲煎 綠翕晦 瓣割 斜瑜縑 んл脹 賅萇 綠翕晦 瓣割擊 殘嬴幗葬堅 綠翕晦 瓣割 斜瑜擊 謙猿и棻.
	// 欽, 諫猿 屬寥擊 褒чж堅 氈朝 蝶溯萄朝 謙猿腎剪釭, 檣攪毀お腎雖 彊朝棻.
	
			//	Asynchronous ServerSocket Channel
	
	// AsynchronousServerSocketChannel擎 舒 陛雖 薑瞳 詭模萄檣 open()擊 ��轎п憮 橢擊 熱 氈棻. 晦獄 綠翕晦 瓣割 斜瑜縑 んл腎朝 AsynchronousServerChannel擊 橢朝 寞徹擎 棻擠婁 偽檜
	// 衙偃高 橈朝 open() 詭模萄蒂 ��轎ж朝 匙檜棻.
	
	//	AsynchronousServerSocketChannel asynchronousServerSocketChannel =
	//	AsynchronousServerSocketChannel.open();
	
	// 滌紫煎 綠翕晦 瓣割 斜瑜擊 儅撩ж堅 罹晦縑 んл腎朝 AsynchronousServerSocketChannel擊 橢堅 談棻賊 棻擠婁 偽檜 綠翕晦 瓣割 斜瑜擊 衙偃高戲煎 乾朝 open() 詭模萄蒂 ��轎ж賊 脹棻.
	
	//	AsynchronousChannelGroup channelGroup = AsynchronousChannelGroup.withFixedThreadPool(
	//		Runtime.getRuntime().availableProcessors(),
	//		Executors.defaultThreadFactory()
	//	);
	//	AsynchronousServerSocketChannel asynchronousServerSocketChannel = 
	//	AsynchronousServerSocketChannel.open(channelGroup);
	
	// AsynchronousServerSocketChannel擊 儅撩ж堅 釭憮朝 んお 夥檣註擊 嬪п 棻擠婁 偽檜 bind() 詭模萄蒂 ��轎п撿 и棻.
	
	//	asynchronousServerSocketChannel.bind(new InetSocketAddress(5001));
	
	// AsynchronousServerSocketChannel擊 渦 檜鼻 餌辨ж雖 彊擊 唳辦縑朝 close() 詭模萄蒂 ��轎п憮 憮幗陛 餌辨и んお蒂 樹夥檣註п遽棻.
	
	//	asynchronousServerSocketChannel.close();
	
	// AsynchronousServerSocketChannel擎 翱唸 熱塊 濛機擊 蝶溯萄ヴ擊 檜辨п憮 綠翕晦煎 籀葬и棻. 棻擠擎 accept() 詭模萄蒂 ��轎ж朝 囀萄檜棻.
	
	//	accept(A attachment, CompletionHandler<AsynchronousSocketChannel, A> handler);
	
	// 羅 廓簞 衙偃高擎 屬寥 詭模萄曖 衙偃高戲煎 薯奢й 繩睡 偌羹檣等, 翱唸 熱塊 濛機縑朝 滌紫曖 繩睡 偌羹陛 в蹂ж雖 彊晦 陽僥縑 null擊 雖薑и棻.
	// 舒 廓簞 衙偃高擎 屬寥 詭模萄蒂 陛雖堅 氈朝 CompletionHandler<AsynchronousSocketChannel, A> 掘⑷ 偌羹檜棻.
	// A朝 繩睡 偌羹 顫殮檣等, 翱唸 熱塊 濛機縑朝 滌紫曖 繩睡 偌羹陛 в蹂ж雖 彊晦 陽僥縑 Void煎 雖薑и棻. 棻擠擎 accept() 詭模萄蒂 ��轎ж朝 晦獄 鄙渠蒂 爾罹遽棻.
	
	//	asynchronousServerSocketChannel.accept(null,
	//		new CompletionHanlder<AsynchronousSocketChannel, Void>() {
	//		@Override
	//		public void completed(AsynchronousSocketChannel asynchronousSocketChannel ,
	//								Void attachment) {
	//			// 翱唸 熱塊 �� 褒чй 囀萄
	//			asynchronousServerSocketChannel.accept(null, this);	// accept() 營��轎
	//		}
	//		@Override
	//		public void failed(Throwable exc, Void attachment) {
	//			// 翱唸 熱塊 褒ぬ 衛 褒чй 囀萄
	//		}
	//	});
	
	// completed() 詭模萄朝 翱唸 熱塊檜 諫猿腎歷擊 陽 蝶溯萄ヴ曖 蝶溯萄陛 ��轎и棻. 羅 廓簞 衙偃高擎 翱唸 熱塊 �� 葬欐脹 AsynchronousSocketChannel檜 渠殮腎堅,
	// 舒 廓簞 衙偃高擎 繩睡 偌羹檣等 accept()曖 羅 廓簞 衙偃高檜 null檜嘎煎 null檜 渠殮脹棻. 虜擒 蝶溯萄ヴ曖 蝶溯萄陛 翱唸 熱塊縑 僥薯陛 儅啖 蕨諼蒂 嫦儅衛酈賊 failed()陛 ��轎脹棻.
	// failed()曖 羅 廓簞 衙偃高擎 蕨諼 偌羹檜堅 舒 廓簞 衙偃高擎 繩睡 偌羹檣等 accept()曖 羅 廓簞 衙偃高檜 null檜嘎煎 null檜 渠殮脹棻.
	// 輿跡й 薄擎 accept()蒂 奩犒п憮 ��轎ж朝 鼠и 瑞Щ陛 橈棻朝 匙檜棻. 渠褐 completed() 詭模萄 部縑 accept()蒂 營��轎п憮 奩犒瞳戲煎 贗塭檜樹お曖 翱唸 熱塊 濛機擊 熱чи棻.
	
			//	Asynchronous Socket Channel
	
	// AsynchronousSocketChannel擎 憮幗諦 贗塭檜樹お縑 陝陝 襄營ж朝等, 贗塭檜樹お陛 AsynchronousSocketChannel擊 儅撩п憮 憮幗煎 翱唸 蹂羶擊 ж賊 憮幗曖
	// AsynchronousServerSocketChannel擎 翱唸 熱塊 �� AsynchronousSocketChannel擊 儅撩п憮 憮煎 鱔褐й 熱 氈紫煙 虜菟橫遽棻.
	// AsynchronousServerSocketChannel檜 儅撩ж朝 AsynchronousSocketChannel擎 濠翕瞳戲煎 AsynchronousServerSocketChannel婁 偽擎 綠翕晦 瓣割 斜瑜縑 樓ж啪 脹棻.
	// 贗塭檜樹お縑憮 AsynchronousSocketChannel擊 儅撩ж溥賊 舒 陛雖 open() 詭模萄蒂 餌辨й 熱 氈棻. 晦獄 綠翕晦 瓣割縑 んл腎朝 AsynchronousSocketChannel擊 橢堅 談棻賊
	// 衙偃高橈朝 open() 詭模萄蒂 ��轎ж賊 脹棻.
	
	//	AsynchronousSocketChannel asynchronousSocketChannel = AsynchronousSocketChannel.open();
	
	// 滌紫煎 綠翕晦 瓣割 斜瑜擊 儅撩ж堅 罹晦縑 んл腎朝 AsynchronousSocketChannel擊 橢堅 談棻賊 棻擠婁 偽檜 綠翕晦 瓣割 斜瑜擊 衙偃高戲煎 乾朝 open() 詭模萄蒂 ��轎ж賊 脹棻.
	
	//	AsynchronousChannelGroup channelGroup = AsynchronousChannelGroup.withFixedThreadPool(
	//		Runtime.getRuntime().availableProcessors();
	//		Executors.defaultThreadFactory()
	//	);
	//	AsynchronousSocketChannel asynchronousSocketChannel = 
	//	AsynchronousSocketChannel.open(channelGroup);
	
	//	AsynchronousSocketChannel擊 渦 檜鼻 餌辨ж雖 彊擊 唳辦縑朝 close() 詭模萄蒂 ��轎п憮 翱唸擊 莒橫遽棻.
	
	//	asynchronousSocketChannel.close();
	
	// 贗塭檜樹お陛 儅撩ж朝 AsynchronousSocketChannel擎 憮幗 蹂羶 濛機擊 蝶溯萄ヴ擊 檜辨п憮 綠翕晦煎 籀葬и棻. 棻擠擎 connect() 詭模萄蒂 ��轎ж朝 囀萄檜棻.
	
	//	connect(SocketAddress remote, A attachment, CompletionHandler<Void, A> handler);
	
	// 羅 廓簞 衙偃高擎 憮幗 IP諦 翱唸 んお 薑爾蒂 陛霞 InetSocketAddress 偌羹檜棻. 舒 廓簞 衙偃高擎 屬寥 詭模萄曖 衙偃高戲煎 薯奢й 繩睡 偌羹檣等, 
	// 翱唸 蹂羶 濛機縑朝 滌紫曖 繩睡 偌羹陛 в蹂ж雖 彊晦 陽僥縑 null擊 雖薑и棻. 撮 廓簞 衙偃高擎 CompletionHandler<Void, A> 掘⑷ 偌羹檜棻. 
	// A朝 繩睡 偌羹 顫殮檣等, 翱唸 蹂羶 濛機縑朝 滌紫曖 繩睡 偌羹陛 в蹂ж雖 彊晦 陽僥縑 Void煎 雖薑и棻.
	// 棻擠擎 connect() 詭模萄蒂 ��轎ж朝 晦獄 鄙渠蒂 爾罹遽棻.
	
	//	asynchronousSocketChannel.connect(new InetSocketAddress("localhost", 5001), null,
	//		new CompletionHandler<Void, Void>() {
	//			@Override
	//			public void completed(Void result, Void attachment) {
	//				// 翱唸 撩奢 �� 褒чй 囀萄
	//			}
	//			@Override
	//			public void failed(Throwable e, Void attachment) {
	//				// 翱唸 褒ぬ �� 褒чй 囀萄
	//			}
	//		});
	//
	
	// completed() 詭模萄朝 翱唸檜 撩歎ц擊 陽 蝶溯萄ヴ曖 蝶溯萄蒂 ��轎и棻. 羅 廓簞 衙偃高擎 null檜 渠殮腎堅, 舒 廓簞 衙偃高擎 繩睡 偌羹檣等 connect()曖 舒 廓簞 衙偃高檜 null檜嘎煎 null檜 渠殮脹棻.
	// completed() 詭模萄縑朝 憮幗陛 爾魚 等檜攪蒂 嫡晦 嬪и 賅萄陛 橾奩瞳戲煎 濛撩脹棻. 虜擒 蝶溯萄ヴ曖 蝶溯萄陛 翱唸 蹂羶縑 僥薯陛 儅啖 蕨諼陛 嫦儅腎賊 failed()陛 ��轎脹棻.
	// 羅 廓簞 衙偃高擎 蕨諼 偌羹檜堅, 舒 廓簞 衙偃高擎 繩睡 偌羹檣等 connect()曖 舒 廓簞 衙偃高檜 null檜嘎煎 null檜 渠殮脹棻.
	
			//	Asynchronous Socket Channel Data Communication
	
	// 贗塭檜樹お諦 憮幗陛 翱唸腎賊 曄薹 AsynchronousSocketChannel曖 read()諦 write() 詭模萄煎 等檜攪 鱔褐擊 й 熱 氈棻.
	// 檜 詭模萄菟擎 ��轎ж朝 闊衛 葬欐腎堅, 褒韓瞳檣 殮轎溘 濛機擎 蝶溯萄ヴ曖 蝶溯萄陛 氬渡и棻. 棻擠擎 read()諦 write()蒂 ��轎ж朝 囀萄檜棻.
	
	//	read(ByteBuffer dst, A attachment, CompletionHandler<Integer, A> handler);
	//	write(ByteBuffer src, A attachment, CompletionHandler<Integer, A> handler);
	
	// 羅 廓簞 衙偃高擎 檗堅 噙晦 嬪и ByteBuffer 偌羹檜棻. 舒 廓簞 衙偃高擎 屬寥 詭模萄曖 衙偃高戲煎 薯奢й 繩睡 偌羹檜棻. 撮 廓簞 衙偃高擎 CompletionHandler<Integer, A> 掘⑷ 偌羹檜棻.
	// Integer朝 檗堅 噹 夥檜お 熱檜堅, A朝 繩睡 偌羹 顫殮檜棻. 棻擠擎 read() 詭模萄蒂 ��轎ж朝 晦獄 鄙渠蒂 爾罹遽棻.
	
	//	asynchronousSocketChannel.read(byteBuffer, attachment,
	//		new CompletionHandler<Integer, A>() {
	//		@Override
	//		public void completed(Integer result, A attachment) {
	//			// 嫡擎 等檜攪蒂 籀葬ж朝 囀萄
	//			asynchronousSocketChannel.read(byteBuffer, attachment, this);
	//		}
	//		@Override
	//		public void failed(Throwable exc, A attachment) {
	//			// 褒ぬ脹 唳辦 褒чй 囀萄
	//		}
	//	});	
	
	// 蝶溯萄ヴ曖 濛機 蝶溯萄陛 檗晦 濛機擊 諫猿ж賊 completed() 詭模萄蒂 ��轎и棻. 羅 廓簞 衙偃高擎 檗擎 夥檜お 熱檜堅, 舒 廓簞 衙偃高擎 繩睡 偌羹檣等 read() 詭模萄 ��轎 衛 餌辨脹 舒 廓簞 衙偃高檜 渠殮脹棻.
	// 虜擒 蝶溯萄ヴ曖 濛機 蝶溯萄縑憮 檗晦 濛機 紫醞 僥薯陛 儅啖 蕨諼陛 嫦儅ж賊 蝶溯萄朝 failed() 詭模萄蒂 ��轎и棻. 羅 廓簞 衙偃高擎 蕨諼 偌羹檜堅, 
	// 舒 廓簞 衙偃高擎 繩睡 偌羹檣等 read() 詭模萄 ��轎 衛 餌辨脹 舒 廓簞 衙偃高檜 渠殮脹棻. 輿跡й 薄擎 read()蒂 奩犒п憮 ��轎ж朝 鼠и 瑞Щ陛 橈棻朝 薄檜棻.
	// 渠褐 completed() 詭模萄 部縑 read()蒂 營��轎п憮 奩犒瞳戲煎 等檜攪蒂 嫡朝 濛機擊 熱чи棻. 棻擠擎 write() 詭模萄蒂 ��轎ж朝 晦獄 鄙渠蒂 爾罹遽棻.
	
	//	asynchronousSocketChannel.write(byteBuffer, attachment,
	//		new CompletionHandler<Integer, A>() {
	//		@Override
	//		public void completed(Integer result, A attachment) {
	//			// 撩奢и 唳辦 褒чй 囀萄
	//		}
	//		@Override
	//		public void failed(Throwable exc, A attachment) {
	//			// 褒ぬ脹 唳辦 褒чй 囀萄
	//		}
	//	});
	
	// 蝶溯萄ヴ曖 濛機 蝶溯萄陛 噙晦 濛機擊 諫猿ж賊 completed() 詭模萄蒂 ��轎и棻. 羅 廓簞 衙偃高擎 餌辨и 夥檜お 熱檜堅, 舒 廓簞 衙偃高擎 繩睡 偌羹檣等 write() 詭模萄 ��轎 衛 餌辨脹 舒 廓簞 衙偃高檜 渠殮脹棻.
	// 虜擒 蝶溯萄ヴ曖 濛機 蝶溯萄縑憮 噙晦 濛機 紫醞 僥薯陛 儅啖 蕨諼陛 嫦儅ж賊 蝶溯萄朝 failed() 詭模萄蒂 ��轎и棻. 
	// 羅 廓簞 衙偃高擎 蕨諼 偌羹檜堅 舒 廓簞 衙偃高擎 繩睡 偌羹檣等 write() 詭模萄 ��轎 衛 餌辨脹 舒 廓簞 衙偃高檜 渠殮脹棻.
	
			//	Chatting Server Implementation		瓣た 憮幗 掘⑷
	
	// TCP 綰煎韁婁 凱綰煎韁縑憮 髦よ爾懊湍 瓣た 憮幗蒂 綠翕晦 瓣割煎 掘⑷п爾賊憮 AsynchronousServerSocketChannel婁 AsynchronousSocketChannel檜 橫飩啪 餌辨腎朝雖 檜пп爾濠.
	
			/*	Server Class Structure		憮幗 贗楚蝶 掘褻	*/
	
	// 01_ JavaFX 詭檣 贗楚蝶煎 虜菟晦 嬪п Application擊 鼻樓嫡朝棻.
	// 02_ 綠翕晦 瓣割 斜瑜檣 AsynchronousChannelGroup в萄蒂 摹樹и棻.
	// 03_ 贗塭檜樹お 翱唸擊 熱塊ж朝 AsynchronousServerSocketChannel в萄蒂 摹樹и棻.
	// 04_ 翱唸脹 贗塭檜樹お蒂 盪濰ж朝 List<Client> 顫殮曖 connections в萄蒂 摹樹и棻. 斜葬堅 蝶溯萄縑 寰瞪и Vector煎 蟾晦�倆葧�.
	// 06_ startServer()朝 憮幗 衛濛 衛 ��轎腎朝 詭模萄檜棻.
	// 07_ stopServer()朝 憮幗 謙猿 衛 ��轎腎朝 詭模萄檜棻.
	// 09_ Client 贗楚蝶朝 翱唸脹 贗塭檜樹お蒂 ル⑷ж朝等, 等檜攪 鱔褐 囀萄蒂 んли棻.
	// 12_ UI 儅撩 囀萄朝 溯檜嬴醒擊 掘撩ж堅 ServerExample擊 褒ч衛鑑棻.
	
	// 褒ч�飛橦□� [start] 幗が擊 贗葛ж賊 startServer() 詭模萄陛 ��轎腎堅, [start] 幗が擎 [stop] 幗が戲煎 滲唳脹棻.
	// [stop] 幗が擊 贗葛ж賊 stopServer() 詭模萄陛 ��轎腎堅, [start] 幗が擊 棻衛 滲唳и棻.
	
			/*	startServer() Method	*/
	
	// [start] 幗が擊 贗葛ж賊 startServer() 詭模萄陛 褒ч腎朝等, startServer() 詭模萄縑朝 AsynchronousChannelGroup 儅撩, AsynchronousServerSocketChannel 儅撩 塽
	// んお 夥檣註, 翱唸 熱塊 囀萄陛 氈橫撿 и棻. 棻擠擎 CPU 囀橫曖 熱虜躑 蝶溯萄蒂 婦葬ж朝 蝶溯萄ヴ擊 儅撩ж堅 檜匙擊 檜辨ж朝 綠翕晦 瓣割 斜瑜擊 儅撩и棻.
	
	//	01	void startServer() {
	//	02		try {
	//	03			channelGroup = AsynchronousChannelGroup.withFixedThreadPool(
	//	04				Runtime.getRuntime().availableProcessors(),
	//	05				Executors.defaultThreadFactory()
	//	06			);

	// 棻擠擎 5001廓 んお縑憮 贗塭檜樹お曖 翱唸擊 熱塊ж朝 AsynchronousServerSocketChannel擊 儅撩и棻.
	
	//	01			serverSocketChannel = AsynchronousServerSocketChannel.open(channelGroup);
	//	02			serverSocketChannel.bind(new InetSocketAddress(5001));
	//	03		} catch(Exception e) {
	//	04			if(serverSocketChannel.isOpen()) { stopServer(); }
	//	05			return;
	//	06		}
	//	07		Platform.runLater( () -> {
	//	08			displayText("[憮幗 衛濛]");
	//	09			btnStartStop.setText("stop");
	//	10		});
	
	// 04 ~ 05_ 5001廓 んお陛 檜嘐 棻艇 Щ煎斜極縑憮 餌辨ж堅 氈棻賊 java.net.BindException檜 嫦儅и棻. 檜 唳辦 AsynchronousServerSocketChannel檜 罹溥 氈朝雖 �挫恉炾�,
	//			stopServer() 詭模萄蒂 褒чи棻. 斜葬堅 return擊 褒чп憮 startServer() 詭模萄蒂 謙猿и棻.
	// 07 ~ 10_ 濛機 蝶溯萄朝 UI蒂 滲唳ж雖 跤ж嘎煎 Platform.runLater()陛 餌辨腎歷棻. "[憮幗 衛濛]"擊 轎溘ж紫煙 displayText()蒂 ��轎ж堅, [start] 幗が曖 旋濠蒂 [stop]戲煎 滲唳и棻.
	
	// 棻擠擎 翱唸 熱塊 濛機擊 ж晦 嬪п accpet() 詭模萄蒂 ��轎ж朝 囀萄檜棻.
	
	//	01	serverSocketChannel.accept(null,
	//	02		new CompletionHandler<AsynchronousSocketChannel, Void>() {
	//	03		@Override
	//	04		public void completed(AsynchronousSocketChannel socketChannel,
	//	05			Void attachment) {
	//	06			try {
	//	07				String message = "[翱唸 熱塊: " + socketChannel.getRemoteAddress() + ": " +
	//	08									Thread.currentThread() + "]";
	//	09				Platform.runLater( () -> displayText(message) );
	//	10			} catch (IOException e) {}
	//	11
	//	12			Client client = new Client(socketChannel);		// Client 偌羹 盪濰
	//	13			connections.add(client);
	//	14			Platform.runLater( () -> displayText("[翱唸 偃熱: " + connections.size() + "]") );
	//	15
	//	16			serverSocketChannel.accept(null, this);		// accept() 棻衛 ��轎
	//	17		}
	//	18		@Override
	//	19		public void failed(Throwable exc, Void attachment) {
	//	20			if(serverSocketChannel.isOpen()) { stopServer(); }
	//	21		}
	//	22	});	// accept() 詭模萄 部
	//	23	}	// startServer() 詭模萄 部

	// 01 ~ 02_ 翱唸 熱塊擊 嬪п accept() 詭模萄蒂 ��轎и棻. 羅 廓簞 衙偃高檣 繩睡 偌羹朝 null擊 輿堅, 
	//			舒 廓簞 衙偃高擎 CompletionHandler<AsynchronousSocketChannel, Void> 顫殮曖 櫛貲 偌羹蒂 遽棻.
	//			AsynchronousSocketChannel擎 唸婁 顫殮檜堅, Void朝 繩睡 顫殮檣等 繩睡陛 橈晦 陽僥縑 Void檜棻.
	// 04_ 翱唸 熱塊 濛機檜 撩奢腎歷擊 陽 屬寥腎朝 completed()蒂 營薑曖и棻. 羅 廓簞 衙偃 顫殮擎 唸婁 顫殮檣 AsynchronousSocketChannel檜堅, 舒 廓簞 衙偃 顫殮檣 Void檜棻.
	// 07 ~ 09_ "[翱唸 熱塊: 贗塭檜樹お IP: 濛機蝶溯萄檜葷]"戲煎 僥濠翮擊 儅撩ж堅, 轎溘ж晦 嬪п displayText()蒂 ��轎и棻.
	// 12 ~ 13_ Client 偌羹蒂 儅撩ж堅 connections 鏽滓暮縑 蹺陛и棻.
	// 14_ "[翱唸 偃熱: ⑷營 婦葬腎堅 氈朝 Client 偌羹 熱]"煎 僥濠翮擊 儅撩ж堅 轎溘ж晦 嬪п displayText()蒂 ��轎и棻.
	// 16_ accept() 詭模萄蒂 營��轎и棻.
	// 19_ 翱唸 熱塊 濛機檜 褒ぬ腎歷擊 陽 屬寥腎朝 failed()蒂 營薑曖и棻. 羅 廓簞 衙偃 顫殮擎 Throwable檜堅, 舒 廓簞 衙偃 顫殮擎 繩睡 顫殮檣 Void 檜棻.
	// 20_ AsynchronousServerSocketChannel檜 翮溥 氈棻賊 stopServer()蒂 ��轎и棻.
	
			/*	stopServer() Method	*/
	
	// [stop] 幗が擊 贗葛ж賊 stopServer() 詭模萄陛 褒ч腎朝等, stopServer() 詭模萄縑朝 賅萇 綠翕晦 瓣割 殘晦, 綠翕晦 瓣割 斜瑜 謙猿 囀萄陛 氈橫撿 и棻.
	
	//	01	void stopServer() {
	//	02		try {
	//	03			connections.clear();
	//	04			if(channelGroup != null && !channelGroup.isShutdown()) {
	//	05				channelGroup.shutdownNow();		// 綠翕晦 瓣割 斜瑜 謙猿(賅萇 綠翕晦 瓣割檜 殘��)
	//	06			}
	//	07			Platform.runLater( () -> {
	//	08				displayText("[憮幗 誇辭]");
	//	09				btnStartStop.setText("start");
	//	10			});
	//	11		} catch (Exception e) {}
	//	12	}
	
	// 03_ connections 鏽滓暮縑 盪濰腎橫 氈朝 賅萇 Client蒂 薯剪и棻.
	// 04 ~ 06_ 綠翕晦 瓣割 斜瑜檜 null檜 嬴棲堅, 謙猿腎雖 彊懊棻賊 shutdownNow()蒂 ��轎п憮 鬼薯瞳戲煎 綠翕晦 瓣割 斜瑜縑 んл脹 賅萇 綠翕晦 瓣割擊 殘嬴幗葬堅 綠翕晦 瓣割 斜瑜擊 謙猿и棻.
	// 07 ~ 10_ 濛機 蝶溯萄朝 UI蒂 滲唳ж雖 跤ж嘎煎 Platform.runLater()陛 餌辨腎歷棻."[憮幗 誇辭]"擊 轎溘ж紫煙 displayText()蒂 ��轎ж堅 [stop] 幗が曖 旋濠蒂 [start]煎 滲唳и棻.
	
			/*	Client Class	*/
	
	// 憮幗朝 棻熱曖 贗塭檜樹お陛 翱唸ж晦 陽僥縑 贗塭檜樹お蒂 婦葬п撿 и棻. 贗楝檜樹お滌煎 堅嶸и 等檜攪蒂 盪濰й в蹂紫 氈晦 陽僥縑 Client 贗楚蒂 濛撩ж堅, 
	// 翱唸 熱塊 衛 葆棻 Client 檣蝶欐蝶蒂 儅撩п憮 婦葬ж朝 匙檜 謠棻. Client 贗楚蝶縑朝 等檜攪 嫡晦 塽 爾頂晦 囀萄陛 氈橫撿 и棻. 棻擠擎 Client 贗楚蝶曖 掘褻蒂 爾罹遽棻.
	
	//	01	class Client {
	//	02		AsynchronousSocketChannel socketChannel;
	//	03
	//	04		Client(AsynchronousSocketChannel socketChannel) {
	//	05			this.socketChannel = socketChannel;
	//	06			receive();
	//	07		}
	//	08
	//	09		void receive() { // 等檜攪 嫡晦 囀萄 }
	//	10		void send(String data) { // 等檜攪 瞪歎 囀萄 }
	//	11	}

	// 01_ Client蒂 ServerExample曖 頂睡 贗楚蝶煎 摹樹и棻.
	// 02_ 鱔褐辨 AsynchronousSocketChannel擊 в萄煎 摹樹и棻.
	// 04 ~ 07_ Client 儅撩濠蒂 摹樹и棻. 衙偃高戲煎 AsynchronousSocketChannel в萄蒂 蟾晦�� ж堅 receive()蒂 ��轎и棻.
	// 09_ 贗塭檜樹お曖 等檜攪蒂 嫡晦 嬪п receive() 詭模萄蒂 摹樹и棻.
	// 10_ 等檜攪蒂 贗塭檜樹お煎 爾頂晦 嬪п send() 詭模萄蒂 摹樹и棻.
	
	// 棻擠 囀萄朝 贗塭檜樹お縑憮 爾魚 等檜攪蒂 嫡朝 receive() 詭模萄檜棻.
	
	//	01	void receive() {
	//	02		ByteBuffer byteBuffer = ByteBuffer.allocate(100);
	//	03		socketChannel.read(byteBuffer, byteBuffer,
	//	04			new CompletionHandler<Integer, ByteBuffer>() {
	//	05			@Override
	//	06			public void completed(Integer result, ByteBuffer attachment) {
	//	07				try {
	//	08					String message = "[蹂羶 籀葬: " + socketChannel.getRemoteAddress() + ": " +
	//	09										Thread.currentThread().getName() + "]";
	//	10					Platform.runLater( () -> displayText(message) );
	//	11
	//	12					attachment.flip();		// 僥濠翮 滲��
	//	13					Charset charset = Charset.forName("UTF-8");
	//	14					String data = charset.decode(attachment).toString();
	//	15	
	//	16					for(Client client : connections) {	// 賅萇 贗塭檜樹お縑啪 爾頂晦
	//	17						client.send(data);	
	//	18					}
	//	19
	//	20					ByteBuffer byteBuffer = ByteBuffer.allocate(100);
	//	21					socketChannel.read(byteBuffer, byteBuffer, this);	// 棻衛 等檜攪 檗晦
	//	22				} catch(Exception e) {}
	//	23			}
	//	24			@Override
	//	25			public void failed(Throwable exc, ByteBuffer attachment) {
	//	26				try {
	//	27					String message = "[贗塭檜樹お 鱔褐 寰脾: " + 
	//	28										socketChannel.getRemoteAddress() + ": " +
	//	29										Thread.currentThread().getName() + "]";
	//	30					Platform.runLater( () -> displayText(message) );
	//	31					connections.remove(Client.this);
	//	32					socketChannel.close();
	//	33				} catch (IOException e) {}
	//	34			}
	//	35		});
	//	36	}
	
	// 02_ 100偃曖 夥檜お蒂 盪濰й 熱 氈朝 ByteBuffer蒂 儅撩и棻.
	// 03 ~ 04_ read()蒂 ��轎и棻. 羅 廓簞 衙偃高擎 檗擎 等檜攪蒂 盪濰й ByteBuffer檜堅, 舒 廓簞 衙偃高擎 屬寥 詭模萄曖 衙偃高戲煎 瞪殖й 繩睡 偌羹檣 ByteBuffer檜棻. 
	//			羅 廓簞 衙偃高婁 舒 廓簞 衙偃高擎 翕橾и ByteBuffer檜棻. 撮 廓簞 衙偃高擎 CompletionHandler<Integer, ByteBuffer> 偌羹檜棻.
	//			唸婁 顫殮擎 Integer檜堅, 繩睡 顫殮擎 ByteBuffer檜棻.
	// 06_ 檗晦 濛機檜 撩奢腎歷擊 陽 屬寥腎朝 completed()蒂 營薑曖и棻. 羅 廓簞 衙偃 顫殮擎 唸婁 顫殮檣 Integer檜堅, 舒 廓簞 衙偃 顫殮擎 繩睡 顫殮檣 ByteBuffer檜棻.
	// 08 ~ 10_ "[蹂羶 籀葬: 贗塭檜樹お IP: 濛機蝶溯萄檜葷]"戲煎 掘撩脹 僥濠翮擊 儅撩ж堅 displayText()蒂 ��轎п憮 轎溘и棻.
	// 12 ~ 14_ 繩睡 偌羹檣 ByteBuffer曖 flip() 詭模萄蒂 ��轎п憮 嬪纂 樓撩高擊 滲唳и �� UTF-8煎 蛤囀註и 僥濠翮擊 橢朝棻.
	// 16 ~ 18_ 僥濠翮擊 賅萇 贗塭檜樹お縑啪 爾頂晦 嬪п connections縑 盪濰脹 Client蒂 ж釭噶 橢橫 send() 詭模萄蒂 ��轎и棻.
	// 20 ~ 21_ 100偃曖 夥檜お蒂 盪濰й 熱 氈朝 ByteBuffer蒂 儅撩ж堅 read()蒂 營��轎и棻.
	// 25_ 檗晦 濛機檜 褒ぬ腎歷擊 陽 屬寥腎朝 failed()蒂 營薑曖и棻. 羅 廓簞 衙偃 顫殮擎 Throwable檜堅, 舒 廓簞 衙偃 顫殮擎 繩睡 顫殮檣 ByteBuffer檜棻.
	// 27 ~ 30_ "[贗塭檜樹お 鱔褐 寰脾: 贗塭檜樹お IP: 濛機蝶溯萄檜葷]"戲煎 掘撩脹 僥濠翮擊 儅撩ж堅 displayText()蒂 ��轎п憮 轎溘и棻.
	// 31_ connections 鏽滓暮縑啪 Client 偌羹蒂 薯剪и棻.
	// 32_ AsynchronousSocketChannel擊 殘朝棻.
	
	// 棻擠 囀萄朝 等檜攪蒂 贗塭檜樹お煎 爾頂朝 send() 詭模萄檜棻.
	
	//	01	void send(String data) {
	//	02		Charset charset = Charset.forName("UTF-8");
	//	03		ByteBuffer byteBuffer = charset.encode(data);
	//	04		socketChannel.write(byteBuffer, null,
	//	05			new CompletionHandler<Integer, Void>() {
	//	06			@Override
	//	07			public void completed(Integer result, Void attachment) {
	//	08			}
	//	09			@Override
	//	10			public void failed(Throwable exc, Void attachment) {
	//	11				try {
	//	12					String message = "[贗塭檜樹お 鱔褐 寰脾: " +
	//	13										socketChannel.getRemoteAddress() + ": " + 
	//	14										Thread.currentThread().getName() + "]";
	//	15					Platform.runLater( () -> displayText(message) );
	//	16					connections.remove(Client.this);
	//	17					socketChannel.close();
	//	18				} catch(IOException e) {}
	//	19			}
	//	20		});
	//	21	}
	
	// 02 ~ 03_ send() 衙偃高檣 爾鳥 僥濠翮煎睡攪 UTF-8煎 檣囀註и ByteBuffer蒂 橢朝棻.
	// 04 ~ 05_ write()蒂 ��轎и棻. 羅 廓簞 衙偃高擎 等檜攪陛 氈朝 ByteBuffer檜堅, 舒 廓簞 衙偃高擎 屬寥 詭模萄曖 衙偃高戲煎 瞪殖и 繩睡 偌羹檣等 噙晦 濛機縑朝 繩睡 偌羹陛 в蹂ж雖 彊晦 陽僥縑 null煎 雖薑и棻.
	//			撮 廓簞 衙偃高擎 CompletionHandler<Integer, Void> 偌羹檜棻. 唸婁 顫殮擎 Integer檜堅, 繩睡й 偌羹陛 橈戲嘎煎 繩睡顫殮擎 Void檜棻.
	// 07_ 噙晦 濛機檜 撩奢腎歷擊 陽 屬寥腎朝 completed()蒂 營薑曖и棻. 羅 廓簞 衙偃 顫殮擎 唸婁 顫殮檣 Integer檜堅 舒 廓簞 衙偃 顫殮擎 繩睡 顫殮檣 Void檜棻.
	// 10_ 噙晦 濛機檜 褒ぬ腎歷擊 陽 屬寥腎朝 failed()蒂 營薑曖и棻. 羅 廓簞 衙偃 顫殮擎 Throwable檜堅, 舒 廓簞 衙偃 顫殮擎 繩睡 顫殮檣 Void檜棻.
	// 12 ~ 15_ "[贗塭檜樹お 鱔褐 寰脾: 贗塭檜樹お IP: 濛機蝶溯萄檜葷]"戲煎 掘撩脹 僥濠翮擊 儅撩ж堅 displayText()蒂 ��轎п憮 轎溘и棻.
	// 16_ connections 鏽滓暮縑憮 Client 偌羹蒂 薯剪и棻.
	// 17_ AsynchronousSocketChannel擊 殘朝棻.
	
			/*	UI Code	*/
	
	// UI 儅撩 囀萄朝 TCP 綰煎韁 瓣割曖 瓣た 憮幗諦 翕橾ж棻.
	
			//	Chatting Client Implementation		瓣た 贗塭檜樹お 掘⑷
	
	// 棻擠擎 贗塭檜樹お 贗楚蝶曖 掘褻蒂 爾罹遽棻.
	
	// 01_ JavaFX 詭檣 贗楚蝶煎 虜菟晦 嬪п Application擊 鼻樓и棻.
	// 02_ 綠翕晦 瓣割 斜瑜檣 AsynchronousChannelGroup в萄蒂 摹樹и棻.
	// 03_ 翱唸 蹂羶擊 ж朝 AsynchronousSocketChannel в萄蒂 摹樹и棻.
	// 05_ startClient() 詭模萄朝 [start] 幗が擊 贗葛ж賊 ��轎脹棻.
	// 06_ stopClient() 詭模萄朝 [stop] 幗が擊 贗葛ж賊 ��轎脹棻.
	// 07_ receive() 詭模萄朝 憮幗縑憮 爾魚 等檜攪蒂 爾魚棻.
	// 08_ send() 詭模萄朝 [send] 幗が擊 贗葛ж賊 ��轎腎朝等. 等檜攪蒂 憮幗煎 爾魚棻.
	// 11_ UI 儅撩 囀萄朝 溯檜嬴醒擊 掘撩ж堅 ClientExample擊 褒ч衛鑑棻.
	
	// 褒ч�飛橦□� [start] 幗が擊 贗葛ж賊 startClient() 詭模萄陛 ��轎腎堅, [start] 幗が擎 [stop] 幗が戲煎 滲唳脹棻.
	//  [stop] 幗が擊 贗葛ж賊 stopClient() 詭模萄陛 ��轎腎堅, [start] 幗が戲煎 棻衛 滲唳脹棻.
	
			/*	startClient() Method	*/
	
	// [start] 幗が擊 贗葛ж賊 startClient() 詭模萄陛 褒ч腎朝等, startClient() 詭模萄縑朝 AsynchronousChannelGroup 儅撩,
	// AsynchronousSocketChannel 儅撩 塽 翱唸 蹂羶 囀萄陛 氈橫撿 и棻. 棻擠擎 CPU 囀橫曖 熱虜躑 蝶溯萄蒂 婦葬ж朝 蝶溯萄ヴ擊 儅撩ж堅 檜匙擊 檜辨ж朝 綠翕晦 瓣割 斜瑜擊 儅撩и棻.
	
	//	01	void startClient() {
	//	02		try {
	//	03			ChannelGroup = AsynchronousChannelGroup.withFixedThreadPool(
	//	04				Runtime.getRuntime().availableProcessors(),
	//	05				Executors.defaultThreadFactory()
	//	06			);
	
	// 棻擠擎 AsynchronousSocketChannel擊 儅撩ж堅 煎鏽 5001戲煎 翱唸 蹂羶擊 ж朝 囀萄檜棻.
	
	//	01			socketChannel = AsynchronousSocketChannel.open(channelGroup);
	//	02			socketChannel.connect(new InetSocketAddress("localhost", 5001), null,
	//	03				new CompletionHandler<Void, Void>() {
	//	04				@Override
	//	05				public void completed(Void result, Void attachment) {
	//	06					Platform.runLater( () -> {
	//	07						try {
	//	08							displayText("[翱唸 諫猿: " + socketChannel.getRemoteAddress() + "]");
	//	09							btnConn.setText("stop");
	//	10							btnSend.setDisable(false);
	//	11						} catch (Exception e) {}
	//	12					});
	//	13					receive();	// 憮幗縑 爾魚 等檜攪 嫡晦
	//	14				}
	//	15				@Override
	//	16				public void failed(Throwable exc, Void attachment) {
	//	17					Platform.runLater( () -> displayText("[憮幗 鱔褐 寰脾]") );
	//	18					if(socketChannel.isOpen()) { stopClient(); }
	//	19				}
	//	20			});
	//	21		} catch (IOException e) {}
	//	22	} // startClient() 部

	// 01_ AsynchronousSocketChannel擊 儅撩и棻.
	// 02_ 煎鏽 5001廓 んお煎 翱唸 蹂羶擊 ж晦 嬪п connect()蒂 ��轎и棻. 羅 廓簞 衙偃高擎 憮幗 IP諦 翱唸 んお 薑爾蒂 陛霞 InetSocketAddress 偌羹檜棻.
	// 05_ 翱唸 蹂羶 濛機檜 撩奢腎歷擊 陽 屬寥腎朝 completed()蒂 營薑曖и棻. 羅 廓簞 衙偃 顫殮婁 舒 廓簞 衙偃 顫殮擎 賅舒 陝陝 Void煎 雖薑и棻.
	// 06_ UI蒂 滲唳ж晦 嬪п Platform.runLater()陛 餌辨腎歷棻.
	// 08_ "[翱唸 諫猿: 憮幗IP]"煎 掘撩脹 僥濠翮擊 儅撩ж堅 displayText()煎 轎溘и棻
	// 09 ~ 10_ [start] 幗が曖 旋濠蒂 [stop]戲煎 滲唳и棻. 斜葬堅 [send] 幗が擊 �側瘓倆挬�.
	// 13_ 憮幗曖 等檜攪蒂 嫡晦 嬪п receive() 詭模萄蒂 ��轎и棻.
	// 16_ 翱唸 蹂羶 濛機檜 褒ぬ腎歷擊 陽 屬寥腎朝 failed()蒂 營薑曖и棻. 羅 廓簞 衙偃 顫殮擎 Throwable檜堅, 舒 廓簞 衙偃 顫殮擎 Void檜棻.
	// 17_ "[憮幗 鱔褐 寰脾]"擊 轎溘ж紫煙 displayText()蒂 ��轎и棻.
	// 18_ AsynchronousSocketChannel檜 翮溥氈戲賊 stopClient() 詭模萄蒂 ��轎и棻.
	
			/*	stopClient() Method	*/
	
	//	01	void stopClient() {
	//	02		try {
	//	03			Platform.runLater( () -> {
	//	04				displayText("[翱唸 莒擠]");
	//	05				btnConn.setText("start");
	//	06				btnSend.setDisable(true);
	//	07			});
	//	08			if(channelGroup != null && !channelGroup.isShutdown()) {
	//	09				channelGroup.shutdownNow();
	//	10			}
	//	11		} catch (IOException e) {}
	//	12	}
	
	// 03_ UI蒂 滲唳ж晦 嬪п Platform.runLater()陛 餌辨腎歷棻.
	// 04_ "[翱唸 莒擠]"擊 轎溘ж紫煙 displayText()蒂 ��轎и棻.
	// 05_ [stop] 幗が曖 旋濠蒂 [start]煎 滲唳и棻.
	// 06_ [send] 幗が擊 綠�側瘓倆挬�.
	// 08 ~ 10_ 綠翕晦 瓣割 斜瑜檜 null檜 嬴棲堅, 謙猿腎雖 彊懊棻賊 shutdownNow()蒂 ��轎п憮 鬼薯瞳戲煎 綠翕晦 瓣割 斜瑜縑 んл脹 賅萇 綠翕晦 瓣割擊 殘嬴幗葬堅 綠翕晦 瓣割 斜瑜擊 謙猿и棻.
	
			/*	receive() Method	*/
	
	// receive() 詭模萄朝 憮幗縑憮 爾魚 等檜攪蒂 嫡朝 羲й擊 и棻. 檜 詭模萄朝 startClient()縑憮 connect()陛 撩奢ц擊 陽 屬寥腎朝 completed() 頂縑憮 ��轎и棻.
	
	//	01	void receive() {
	//	02		ByteBuffer byteBuffer = ByteBuffer.allocate(100);
	//	03		socketChannel.read(byteBuffer, byteBuffer,
	//	04			new CompletionHandler<Integer, ByteBuffer>() {
	//	05			@Override
	//	06			public void completed(Integer result, ByteBuffer attachment) {
	//	07				try {
	//	08					attachment.flip();
	//	09					Charset charset = Charset.forName("UTF-8");
	//	10					String data = charset.decode(attachment).toString();
	//	11					Platform.runLater( () -> displayText("[嫡晦 諫猿] " + data) );
	//	12					
	//	13					ByteBuffer byteBuffer = ByteBuffer.allocate(100);
	//	14					socketChannel.read(byteBuffer, byteBuffer, this);	// 棻衛 等檜攪 檗晦
	//	15				} catch(Exception e) {}
	//	16			}
	//	17			@Override
	//	18			public void failed(Throwable exc, ByteBuffer attachment) {
	//	19				Platform.runLater( () -> displayText("[憮幗 鱔褐 寰脾]") );
	//	20				stopClient();
	//	21			}
	//	22		});
	//	23	}
	
	// 02_ 嫡擎 等檜攪蒂 盪濰й 望檜陛 100檣 ByteBuffer蒂 儅撩и棻.
	// 03 ~ 04_ read()蒂 ��轎и棻. 羅 廓簞 衙偃高擎 檗擎 等檜攪蒂 盪濰й ByteBuffer檜堅, 舒 廓簞 衙偃高擎屬寥 詭模萄曖 衙偃高戲煎 瞪殖й 繩睡 偌羹檣 ByteBuffer檜棻.
	//			羅 廓簞 衙偃高婁 舒 廓簞 衙偃高擎 翕橾и ByteBuffer檜棻. 撮 廓簞 衙偃高擎 CompletionHandler<Integer, ByteBuffer> 偌羹檜棻.
	//			唸婁 顫殮擎 Integer檜堅, 繩睡 顫殮擎 ByteBuffer檜棻.
	// 06_ 檗晦 濛機檜 撩奢腎歷擊 陽 屬寥腎朝 completed()蒂 營薑曖и棻. 羅 廓簞 衙偃 顫殮擎 唸婁 顫殮檣 Integer檜堅, 舒 廓簞 衙偃 顫殮擎 繩睡 顫殮檣 ByteBuffer檜棻.
	// 08 ~ 11_ 繩睡 偌羹檣 ByteBuffer曖 flip() 詭模萄蒂 ��轎п憮 嬪纂 樓撩高擊 滲唳и �� UTF-8煎 蛤囀註и 僥濠翮擊 橢朝棻. 斜葬堅 僥濠翮擊 轎溘ж晦 嬪п displayText()蒂 ��轎и棻.
	// 13 ~ 14_ 100偃曖 夥檜お蒂 盪濰й 熱 氈朝 ByteBuffer蒂 儅撩ж堅 read()蒂 營��轎и棻.
	// 18_ 檗晦 濛機檜 褒ぬ腎歷擊 陽 屬寥腎朝 failed()蒂 營薑曖и棻. 羅 廓簞 衙偃 顫殮擎 Throwable檜堅, 舒 廓簞 衙偃 顫殮擎 繩睡 顫殮檣 ByteBuffer檜棻.
	// 19_ "[憮幗 鱔褐 寰脾]" 僥濠翮擊 轎溘ж晦 嬪п displayText()蒂 ��轎и棻.
	// 20_ stopClient()蒂 ��轎и棻.
	
			/*	send(String data) Method	*/
	
	// send(String data) 詭模萄朝 餌辨濠陛 詭撮雖蒂 殮溘ж堅 [send] 幗が擊 贗葛ж賊 詭撮雖蒂 衙偃高戲煎 п憮 ��轎脹棻.
	// send() 詭模萄朝 詭撮雖蒂 憮幗煎 爾頂朝 羲й擊 и棻.
	
	//	01	void send(String data) {
	//	02		Charset charset = Charset.forName("UTF-8");
	//	03		ByteBuffer byteBuffer = charset.encode(data);
	//	04		socketChannel.write(byteBuffer, null, new CompletionHandler<Integer, Void>() {
	//	05			@Override
	//	06			public void completed(Integer result, Void attachment) {
	//	07				Platform.runLater( () -> displayText("[爾頂晦 諫猿]") );
	//	08			}
	//	09			@Override
	//	10			public void failed(Throwable exc, Void attachment) {
	//	11				Platform.runLater( () -> displayText("[憮幗 鱔褐 寰脾]") );
	//	12				stopClient();
	//	13			}
	//	14		});
	//	15	}
	
	// 02 ~ 03_ send()曖 衙偃高檣 僥濠翮煎睡攪 UTF-8煎 檣囀註и ByteBuffer蒂 橢朝棻.
	// 04_ write()蒂 ��轎и棻. 羅 廓簞 衙偃高擎 等檜攪陛 氈朝 ByteBuffer檜堅, 舒 廓簞 衙偃高擎 屬寥 詭模萄曖 衙偃高戲煎 瞪殖и 繩睡 偌羹檣等 橈戲嘎煎 null檜棻.
	//		撮 廓簞 衙偃高擎 CompletionHandler<Integer, Void> 偌羹檜棻. 唸婁 顫殮擎 Integer檜堅, 繩睡й 偌羹陛 橈戲嘎煎 偌羹 顫殮擎 Void檜棻.
	// 06_ 噙晦 濛機檜 撩奢腎歷擊 陽 屬寥腎朝 completed()蒂 營薑曖и棻. 羅 廓簞 衙偃 顫殮擎 唸婁 顫殮檣 Integer檜堅, 舒 廓簞 衙偃 顫殮擎 繩睡 顫殮檣 Void檜棻.
	// 07_ "[爾頂晦 諫猿]"蒂 轎溘ж晦 嬪п displayText()蒂 ��轎и棻.
	// 10_ 噙晦 濛機檜 褒ぬ腎歷擊 陽 屬寥腎朝 failed()蒂 營薑曖и棻. 羅 廓簞 衙偃 顫殮擎 Throwable檜堅, 舒 廓簞 衙偃 顫殮擎 繩睡 顫殮檣 Void檜棻.
	// 11_ "[憮幗 鱔褐 寰脾]"擊 轎溘ж晦 嬪п displayText()蒂 ��轎и棻.
	// 12_ stopClient()蒂 ��轎и棻.
	
			/*	UI Code	*/
	
	// UI 儅撩 囀萄朝 TCP 綰煎韁 瓣割曖 瓣た 贗塭檜樹お諦 翕橾ж嘎煎 儅楞и棻. 瓣た 憮幗諦 贗塭檜樹お 褒ч 寞徹擎 TCP 綰煎韁 瓣割曖 瓣た 憮幗諦 贗塭檜樹お 褒ч 寞徹婁 翕橾ж棻.
}
