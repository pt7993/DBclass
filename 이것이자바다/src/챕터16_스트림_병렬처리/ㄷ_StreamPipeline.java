package 矇攪16_蝶お葡_煽溺籀葬;

public class 之_StreamPipeline {
	// 渠榆曖 等檜攪蒂 陛奢п憮 蹴模ж朝 匙擊 橾奩瞳戲煎 葬湯暮(Reduction)檜塭堅 ж朝等, 等檜攪曖 м啗, ゎ敕高, 蘋遴た, 譆渤高, 譆模高 蛔檜 渠ル瞳檣 葬湯暮曖 唸婁僭檜塭堅 獐 熱 氈棻.
	// 斜楝釭 鏽滓暮曖 蹂模蒂 葬湯暮曖 唸婁僭煎 夥煎 餵啗й 熱 橈擊 唳辦縑朝 餵啗ж晦 謠紫煙 в攪葭, 衙ё, 薑溺, 斜瑜ё 蛔曖 醞除 籀葬陛 в蹂ж棻.
	
			//	Middle Handling And Final Handling		醞除 籀葬諦 譆謙 籀葬
	
	// 蝶お葡擎 等檜攪曖 в攪葭, 衙ё, 薑溺, 斜瑜ё 蛔曖 醞除 籀葬諦 м啗, ゎ敕, 蘋遴た, 譆渠高, 譆模高 蛔曖 譆謙 籀葬蒂 だ檜Щ塭檣(pipelines)戲煎 п唸и棻.
	// だ檜Щ塭檣擎 罹楝 偃曖 蝶お葡檜 翱唸腎橫 氈朝 掘褻蒂 蜓и棻. だ檜Щ塭檣縑憮 譆謙 籀葬蒂 薯諼ж堅朝 賅舒 醞除 籀葬 蝶お葡檜棻.
	
	//							|	醞除 籀葬		| |	譆謙 籀葬	|
	//	蝶お葡 模蝶		﹤ ﹤ ﹤		﹤ ﹤ ﹤		﹤ ﹤ ﹤		⊥		唸婁
	//	(鏽滓暮, 寡翮,
	//	だ橾)			螃葬雖陳		в攪葭 籀葬		衙ё 籀葬		餵啗 籀葬
	//				蝶お葡		醞除 蝶お葡		譆謙 蝶お葡		唸婁僭
	
	// 醞除 蝶お葡檜 儅撩腆 陽 蹂模菟檜 夥煎 醞除 籀葬(в攪葭, 衙ё, 瞰溺)腎朝 匙檜 嬴棲塭 譆謙 籀葬陛 衛濛腎晦 瞪梱雖 醞除 籀葬朝 雖翱(lazy)脹棻.
	// 譆謙 籀葬陛 衛濛腎賊 綠煎模 鏽滓暮曖 蹂模陛 ж釭噶 醞除 蝶お葡縑憮  籀葬腎堅 譆謙 籀葬梱雖 螃啪 脹棻.
	
	// Stream 檣攪む檜蝶縑朝 в攪葭, 衙ё, 薑溺 蛔曖 號擎 醞除 籀葬 詭模萄陛 氈朝等, 檜 詭模萄菟擎 醞除 籀葬脹 蝶お葡擊 葬欐и棻.
	// 斜葬堅 檜 蝶お葡縑憮 棻衛 醞除 籀葬 詭模萄蒂 ��轎п憮 だ檜Щ塭檣擊 ⑽撩ж啪 脹棻. 蕨蒂 菟橫 �蛾� 鏽滓暮縑憮 陴濠虜 в攪葭ж朝 醞除 蝶お葡擊 翱唸ж堅,
	// 棻衛 陴濠曖 釭檜煎 衙ёж朝 蝶お葡擊 唯唸и ��, 譆謙 陴濠 ゎ敕 釭檜蒂 餵啗и棻賊 棻擠婁 偽檜 だ檜Щ塭檣檜 ⑽撩脹棻.
	
	//									  |					醞除 籀葬					| 	譆謙 籀葬			|
	//	�蛾� 鏽滓暮			Member(陴/喪)		  |		Member(陴濠)		|		age			|		⊥				⊥ ゎ敕 釭檜
	//	Member(陴)			螃葬雖陳		  ∟			陴濠 蹂模		∟		釭檜 蹂模		∟		餵啗 籀葬
	//	Member(罹)			Stream	  filter()		Stream	mapToInt()	IntStream	|		OptionDouble
	//																			average()
	
	// だ檜Щ塭檣擊 濠夥 囀萄煎 ル⑷ж賊 棻擠婁 偽棻.
	
	//	Stream<Member> maleFemaleStream = list.stream();
	//	Stream<Member> maleStream = maleFemaleStream.filter( m -> m.getSex() == Member.MALE );
	//	IntStream ageStream = maleStream.mapToInt( Member :: getAge );
	//	OptionalDouble optionalDouble = ageStream.average();
	//	double ageAvg = optionalDouble.getAsDouble();
	
	// 煎鏽 滲熱蒂 儅楞ж堅 翱唸ж賊 棻擠婁 偽擎 ⑽鷓曖 だ檜Щ塭檣 囀萄虜 陴朝棻.
	
	//	double ageAvg = list.stream()					// 螃葬雖陳 蝶お葡
	//		.filter( m -> m.getSex() == Member.MALE)	// 醞除籀葬 蝶お葡
	//		.mapToInt( Member :: getAge)				// 醞除籀葬 蝶お葡
	//		.average()									// 譆謙 籀葬
	//		.getAsDouble();
	
	// filter( m -> m.getSex() == Member.MALE )朝 陴濠 Member 偌羹蒂 蹂模煎 ж朝 億煎遴 蝶お葡擊 儅撩и棻.
	// mapToInt(Member :: getAge())朝 Member 偌羹蒂 age 高戲煎 衙ёп憮 age蒂 蹂模煎 ж朝 億煎遴 蝶お葡擊 儅撩и棻. average() 詭模萄朝 age 蹂模菟曖 ゎ敕擊 OptionalDouble縑 盪濰и棻.
	// OptionalDouble縑憮 盪濰脹 ゎ敕高擊 檗戲溥賊 getAsDouble() 詭模萄蒂 ��轎ж賊 脹棻.
	
			//	Middle Handling Methods And Final Handling Methods		醞除 籀葬 詭模萄諦 譆謙 籀葬 詭模萄
	
	// 蝶お葡 だ檜Щ塭檣縑憮 醞除 籀葬蒂 ж朝 詭模萄諦 譆謙 籀葬蒂 ж朝 詭模萄曖 謙盟蒂 髦よ爾濠.
	// 棻擠擎 蝶お葡檜 薯奢ж朝 醞除 籀葬諦 譆謙 籀葬蒂 ж朝 詭模萄蒂 撲貲и 匙檜棻.
	
	//		謙盟				葬欐顫殮			詭模萄				模樓脹 檣攪む檜蝶
	//式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式
	//	醞除		в攪葭						distinct()				奢鱔
	//	籀葬									filter()				奢鱔
	//式式式式式式式式式式式式式式						式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式									
	//			衙ё							flatMap()				奢鱔
	//										flatMapToDouble()		Stream
	//										flatMapToInt()			Stream
	//					Stream				flatMapToLong()			Stream
	//					IntStream			map()					奢鱔
	//					LongStream			mapToDouble				Stream, IntStream, LongStream
	//					DoubleStream		mapToInt()				Stream, LongStream, DoubleStream		
	//										mapToLong()				Stream, IntStream, DoubleStream
	//										mapToObj()				IntStream, LongStream, DoubleStream
	//										asDoubleStream()		IntStream, LongStream
	//										asLongStream()			IntStream
	//										boxed()					IntStrea, LongStream, DoubleStream
	//式式式式式式式式式式式式式式						式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式		
	//			薑溺							sorted()				奢鱔
	//式式式式式式式式式式式式式式						式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式			
	//			瑞ё							peek()					奢鱔
	//式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式
	//	譆謙		衙蘆		boolean				allMatch()				奢鱔
	//	籀葬				boolean				anyMatch()				奢鱔
	//					boolean				noneMatch()				奢鱔
	//式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式
	//			餵啗		long				count()					奢鱔
	//					OptionalXXX			findFirst()				奢鱔
	//					OptionalXXX			max()					奢鱔
	//					OptionalXXX			min()					奢鱔
	//					OptionalDouble		average()				IntStream, LongStream, DoubleStream
	//					OptionalXXX			reduce()				奢鱔
	//					int, long, double	sum()					IntStream, LongStream, DoubleStream
	//式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式
	//			瑞ё		void				forEach()				奢鱔
	//式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式
	//			熱餵		R					collect()				奢鱔
	//式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式
	
	// 醞除 籀葬 詭模萄諦 譆謙 籀葬 詭模萄蒂 蔣啪 掘碟ж朝 寞徹擎 葬欐 顫殮擊 爾賊 脹棻. 葬欐 顫殮檜 蝶お葡檜塭賊 醞除 籀葬 詭模萄檜堅,
	// 晦獄 顫殮檜剪釭 OptionalXXX塭賊 譆謙 籀葬 詭模萄檜棻. 模樓脹 檣攪む檜蝶縑憮 奢鱔曖 曖嘐朝 Stream, IntStream, LongStream, DoubleStream縑憮 賅舒 薯奢脹棻朝 嗆檜棻.
}
