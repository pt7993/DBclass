package 矇攪17_JavaFX;

public class 今_JavaFX_Control {
	// JavaFX朝 棻曄и UI 鐘お煤擊 薯奢ж堅 氈棻. 檜廓 瞰縑朝 餌辨 綴紫陛 堪擎 幗が 鐘お煤, 殮溘 鐘お煤, 箔 鐘お煤, 嘐蛤橫 鐘お煤, 穩お 鐘お煤縑 渠п憮 髦よ獐 匙檜棻.
	
			//	Button Control
	
	// 幗が 鐘お煤擎 葆辦蝶煎 贗葛й 熱 氈朝 鐘お煤煎 ButtonBase蒂 鼻樓ж朝 ж嬪 鐘お煤擊 蜓и棻. Button, CheckBox, RadioButton, ToggleButton, Hyperlink 蛔檜 氈棻.
	
	//		Button			CheckBox			RadioButton		ToggleButton
	//
	//	忙式式式忖 忙式式式式式忖		﹤ Security			≡ Home			忙式式式式式成式式式式式成式式式式式式式式忖
	//	弛幗が	弛 弛  v	弛		﹤ Project			∞ Calendar		弛Minor弛Major弛Critical弛
	//	戌式式式戎 戌式式式式式戎											戌式式式式式扛式式式式式扛式式式式式式式式戎
	
	// 晦獄 Button擎 欽牖и 旋濠煎 掘撩脹棻. ж雖虜 ImageView蒂 衙偃高戲煎 п憮 setGraphic() 詭模萄蒂 ��轎ж賊 嬴檜夔擊 厥擊 熱 氈棻. 棻擠擎 嬴檜夔 幗が擊 FXML煎 濛撩ж朝 寞徹擊 爾罹遽棻.
	
	//	<Button text="嬴檜夔幗が">
	//		<graphic>
	//			<ImageView>
	//				<Image url="@images/history_view.gif"/>
	//			</ImageView>
	//		</graphic>
	//	</Button>
	
	// CheckBox, RadioButton, ToggleButton 鐘お煤擎 摹鷗婁 嘐摹鷗 舒 陛雖 鼻鷓蒂 陛韓 熱 氈棻. selected 樓撩曖 高檜 true檜賊 摹鷗檜堅, false檜賊 嘐摹鷗檜棻.
	// 棻擠擎 checkBox 鐘お煤擊 FXML煎 摹樹и 匙檜棻. text 樓撩擎 餌辨濠縑啪 爾罹輿朝 僥濠翮檜堅 userData 樓撩擎 Щ煎斜極縑憮 籀葬ж朝 等檜攪檜棻.
	
	//	<CheckBox text="塭漣1" userData="高1" />
	//	<CheckBox text="塭漣2" userDate="高2" selected="true" />
	
	// RadioButton, ToggleButton縑朝 toggleGroup 樓撩檜 氈朝等, 偽擎 ToggleGroup擊 霤褻й 唳辦 ж釭曖 斜瑜戲煎 僮檜貊, 偽擎 斜瑜 頂縑憮朝 ж釭曖 鐘お煤虜 摹鷗腎朝 �膩�陛 氈棻.
	// 霤褻й ToggleGroup 偌羹朝 <fx:define> 鷓斜蒂 餌辨п憮 <ToggleGroup fx:id"groupName" /> 濛撩ж堅,
	// RadioButton曖 toggleGroup 樓撩縑憮 $groupName戲煎 霤褻и棻. 棻擠擎 2偃曖 RadioButton擊 ж釭曖 斜瑜戲煎 僮橫憮 摹樹и 匙檜棻.
	
	//	<fx:define>
	//		<ToggleGroup fx:id="groupName" />
	//	</fx:define>
	
	//	<RadioButton text="塭漣1" userData="高1" toggleGroup="$groupName" />
	//	<RadioButton text="塭漣2" userData="高1" toggleGroup="$groupName" selected="true" />
	
	// CheckBox, RadioButton, ToggleButton 鐘お煤擎 餌辨濠陛 贗葛ж賊 
	// ActionEvent陛 嫦儅ж晦 陽僥縑 EventHandler煎 籀葬陛 陛棟ж堅, onAction 樓撩擊 濛撩п憮 鐘お煤楝曖 檜漸お 籀葬 詭模萄煎 翱唸й 熱紫 氈棻.
	
	//	<CheckBox ...onAction="#handleChkAction" />
	
	// 虜擒 RadioButton 傳朝 ToggleButton 斜瑜 頂縑憮 摹鷗 滲唳擊 馬衛ж堅 談棻賊 ToggleGroup曖 selectedToggle 樓撩擊 棻擠婁 偽檜 濛撩ж賊 脹棻.
	
	//	groupName.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
	//		@Override
	//		public void changed(ObservableValue<? extends Toggle> observable,
	//							Toggle oldValue, Toggle newValue) {...}
	//	});
	
	// 摹鷗 滲唳檜 腎賊 changed() 詭模萄陛 褒ч腎堅 撮 廓簞 衙偃高檣 newValue縑 葆雖虞戲煎 摹鷗脹 鐘お煤檜 渠殮脹棻.
	// 棻擠 蕨薯朝 CheckBox諦 RadioButton曖 檜漸お 籀葬蒂 橫飩啪 ж朝雖 爾罹遽棻.
	
			//	Input Control	殮溘 鐘お煤
	
	// 殮溘 鐘お煤縑朝 и 還 殮溘擊 嬪и TextField, 棻醞 ч 殮溘擊 嬪и TextArea, ぬ蝶錶萄 殮溘擊 嬪и PasswordField, 薯и脹 о跡縑憮 摹鷗ж朝 ComboBox陛 氈棻.
	// 傳и 陳瞼蒂 摹鷗й 熱 氈朝 DatePicker, 儀鼻擊 摹鷗й 熱 氈朝 ColorPicker, HTML擊 殮溘ж晦 嬪и HTMLEditor紫 殮溘 鐘お煤檜塭堅 獐 熱 氈棻.
	// Label擎 殮溘 鐘お煤擎 嬴棲雖虜 殮溘 鐘お煤曖 薯跡擊 ル衛й 陽 餌辨脹棻.
	
	//	Label & TextField			PasswordField			TextArea
	//
	//		 忙式式式式式式式忖				忙式式式式式式式式式式式忖			忙式式式式式式式式式式式式式式式式式式式式式式式忖
	//	Name:弛Michael弛				弛≒≒≒≒≒≒≒	弛			弛abc					弛
	//		 戌式式式式式式式戎				戌式式式式式式式式式式式戎			弛陛釭棻					弛
	//														戌式式式式式式式式式式式式式式式式式式式式式式式戎
	//
	//		ComboBox				DatePicker				ColorPicker
	//
	//	忙式式式式式式式式式式式忖				忙式式式式式式式式式式式式式式式忖		忙式式式式式式式忖
	//	弛		   ∪弛				弛<02錯 >	  <2020>弛		弛﹤ White弛
	//	戌式式式式式式式式式式式戎				弛橾 錯  �� 熱  跡  旎 饜	弛		戌式式式式式式式戎式式式式式式式忖
	//	弛Option 1	弛				弛1 2 3 4 5 6 7	弛		弛﹤	﹥	...		弛
	//	戌式式式式式式式式式式式戎				弛8 9 ...		弛		弛				弛
	//	弛Option2	弛				戌式式式式式式式式式式式式式式式戎		戌式式式式式式式式式式式式式式式戎
	//	戌式式式式式式式式式式式戎
	//
	//							HTMLEditor
	//
	//	忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖
	//	弛﹤	﹤	﹤	﹤	﹤	﹥	﹥	﹥ A∪										弛
	//	弛忙式式式式式式忖	忙式式式式式式忖	忙式式式式式式式式式式式式式忖		B	I	U					弛
	//	弛戌式式式式式式戎	戌式式式式式式戎	戌式式式式式式式式式式式式式戎									弛
	//	弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛
	//	弛This is HTML Page!														弛
	//	弛																		弛
	//	戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎
	
	// 棻擠擎 殮溘 鐘お煤擊 FXML煎 摹樹ж朝 寞徹擊 爾罹遽棻.
	
	//	<Label prefWidth="ァ" prefHeight="堪檜" text="薯跡" />
	//	<TextField prefWidth="ァ" prefHeight="堪檜" promptText="�爩捆挫睊�" />
	//	<PasswordField preWidth="ァ" prefHeight="堪檜" promptText="�爩捆挫睊�" />
	//
	//	<ComboBox prefWidth="ァ" prefHeight="堪檜" promptText="�爩捆挫睊�" >
	//		<items>
	//			<FXCollections fx:factory="observableArrayList" >
	//				<String fx:value="奢偃" />
	//				<String fx:value="綠奢偃" />
	//			</FXCollections>
	//		</item>
	//	</ComboBox>
	//
	//	<DatePicker prefWidth="ァ" prefHeight="堪檜" promptText="�爩捆挫睊�" />
	//	<TextArea prefWidth="ァ" prefHeight="堪檜" promptText="�爩捆挫睊�" />
	
	// prefWidth諦 prefHeight朝 陝陝 ァ婁 堪檜蒂 撲薑ж堅,promptText朝 �爩� 僥濠翮煎 鐘お煤檜 ん醴蝶蒂 橢啪 腎賊 餌塭霞棻.
	
	// 棻擠 蕨薯朝 殮溘 鐘お煤煎 掘撩脹 イ擊 薯奢и棻. 薯跡擎 TextField, 綠塵廓�ㄣ� PasswordField, 奢偃朝 ComboBox, 啪衛謙猿朝 DataPicker, 頂辨擎 TextArea煎 掘撩ц棻.
	// [蛔煙] 幗が擊 贗葛ж賊 賅萇 殮溘脹 頂辨檜 夔樂縑 轎溘脹棻.
	
			//	View Control
	
	// 箔 鐘お煤擎 臢蝶お 傳朝 檜嘐雖 蛔擊 爾罹輿朝等 跡煙 ⑽鷓煎 爾罹輿朝 ListView, 纔檜綰 ⑽鷓煎 爾罹輿朝 TableView, 檜嘐雖蒂 爾罹輿朝 ImageView陛 氈棻.
	
	//		ListView		TableView						ImageView
	//
	//	忙式式式式式式式式式式式忖		忙式式式式式式式式式式式式式式式式式式式式式式式忖		忙式式式式式式式式式式式式式式式式式式式式式式式忖
	//	弛Single		弛		弛First Name	弛Last Name	弛		弛						弛
	//	忙式式式式式式式式式式式忖		忙式式式式式式式式式式式式式式式式式式式式式式式忖		弛						弛
	//	弛Double		弛		弛Jacob		弛Smith		弛		弛						弛
	//	忙式式式式式式式式式式式忖		忙式式式式式式式式式式式式式式式式式式式式式式式忖		弛		檜嘐雖			弛
	//	弛Suite		弛		弛Isabella	弛William	弛		弛						弛
	//	忙式式式式式式式式式式式忖		忙式式式式式式式式式式式式式式式式式式式式式式式忖		弛						弛
	//	弛Family App	弛		弛Ethan		弛Jones		弛		弛						弛
	//	戌式式式式式式式式式式式戎		戌式式式式式式式式式式式式式式式式式式式式式式式戎		戌式式式式式式式式式式式式式式式式式式式式式式式戎
	
			/*	ImageView Control	*/
	
	//	<ImageView fitWidth="ァ" fitHeight="堪檜" preserveRatio="true" />
	
	// fitWidth諦 fitHeight朝 ImageView曖 ァ婁 堪檜蒂 雖薑и棻. preserveRatio 樓撩擎 檜嘐雖曖 謙�噥騆� 嶸雖й 匙檣雖蒂 雖薑и棻.
	// false蒂 輿賊 謙�噥鬵� 鼻婦橈檜 fitWidth諦 fitHeight縑 蜃啪 ImageView 觼晦陛 堅薑腎堅, true蒂 輿賊 檜嘐雖曖 謙�噥騆� 嶸雖ж晦 嬪п ImageView 觼晦陛 褻薑脹棻.
	// ImageView縑 爾罹還 檜嘐雖朝 舒 陛雖 寞徹戲煎 撲薑й 熱 氈朝等, 羅 廓簞 寞徹擎 ImageView曖 儅撩濠 衙偃高戲煎 Image 偌羹蒂 撲薑ж朝 匙檜棻.
	
	//	<ImageView preserveRatio="true" >
	//		<Image url="@images/flower.png" />
	//	</ImageView>
	
	// 舒 廓簞 寞徹擎 ImageView曖 setImage() 詭模萄煎 撲薑ж朝等, 羲衛 衙偃高擎 Image 偌羹檜棻.
	
	//	<ImageView fitWidth="200" fitHeight="150" preserveRatio=true" >
	//		<image>
	//			<ImageView url="@images/flower.png" />
	//		<image>
	//	</ImageView>
	
	// Image朝 url 樓撩(儅撩濠 衙偃 滲熱)擊 陛雖堅 氈朝等 FXML だ橾 嬪纂縑憮 鼻渠 唳煎煎"@檜嘐雖 唳煎"蒂 高戲煎 輿賊 脹棻.
	
			/*	ListView Control	*/
	
	// ListView朝 о跡菟擊 跡煙戲煎 爾罹輿朝 鐘お煤檜棻. FXML煎 摹樹ж朝 寞徹擎 棻擠婁 偽棻.
	
	//	<ListView prefWidth="ァ" prefHeight="堪檜" />
	
	// ListView縑 о跡擊 蹺陛ж溥賊 setItems(ObservableList<T> value) 詭模萄蒂 餌辨и棻.
	// ObservableList 掘⑷ 偌羹朝 FXCollections.observableArrayList(E ... items) 薑瞳 詭模萄煎 儅撩ж賊 脹棻.
	
	//	listView.setItems(FXCollections.observableArrayList("Swing", "JavaFX"));
	
	//	<ListView fx:id="listView" prefHeight="100" prefWidth="100" >
	//		<item>
	//			<FXCollections fx:factory="observableArrayList" >
	//				<String fx:value="Swing" />
	//				<String fx:value="JavaFX" />
	//			</FXCollections>
	//		</item>
	//	</ListView>
	
	// LastView縑憮 摹鷗脹 檣策蝶諦 о跡擊 橢戲溥賊 樓撩 馬衛蒂 檜辨й 熱 氈棻. getSelectionModel() 詭模萄煎 MultipleSelectionModel擊 橢堅 釭憮,
	// selectedIndexProperty 傳朝 selectedItemProperty縑 葬蝶傘蒂 撲薑ж賊 脹棻. selectedIndexProperty朝 摹鷗脹 檣策蝶檜堅, selectedItemProperty朝 摹鷗脹 о跡檜棻.
	// 棻擠擎 selectedItemProperty縑 葬蝶傘蒂 撲薑ж朝 囀萄檜棻.
	
	//	listView.getSelectionModel().selectedItemProperty().addListener(
	//		new ChangeListener<String>() {
	//			@Override
	//			public void changed(ObservableValue<? extends String> observable,
	//								String oldValue, String newValue) {...}
	//		}
	//	);
	
			/*	TableView Control	*/
	
	// TableView蒂 FXML煎 摹樹ж朝 寞徹擎 棻擠婁 偽棻. <column> 鷓斜 寰縑 虜菟堅濠 ж朝 鏽歲曖 偃熱虜躑 <TableColumn> 鷓斜蒂 摹樹ж賊 脹棻.
	
	//	<TableView prefHeight="100" prefWidth="300" >
	//		<column>
	//			<TableColumn prefWidth="150" text="蝶葆おア" />
	//			<TableColumn prefWidth="150" text="檜嘐雖" />
	//		</column>
	//	</TableView>
	
	// TableView縑 ч(row)擊 蹺陛ж溥賊 ч曖 等檜攪蒂 陛雖堅 氈朝 賅筐(model) 偌羹陛 в蹂ж棻. 嬪 囀萄蒂 爾賊 蝶葆おア婁 檜嘐雖 鏽歲檜 氈朝等, 檜 舒 高擊 樓撩戲煎 乾朝 賅筐 偌羹蒂 儅撩п憮 ч曖 等檜攪煎 薯奢п撿 и棻.
	// 棻擠擎  Phone 賅筐 贗楚蝶蒂 儅撩ж朝 寞徹擊 爾罹遽棻.
	
	// 賅筐曖 樓撩 顫殮擎 鏽毀 高曖 等檜攪 顫殮縑 評塭憮 javafx.beans.property ぬ酈雖曖 SimpleXXXProperty蒂 餌辨ж賊 脹棻.
	// 賅筐 贗楚蝶蒂 濛撩ж艘棻賊 檜薯 賅筐 樓撩婁 TableColumn擊 翱唸衛酈朝 囀萄蒂 濛撩п撿 и棻. TableColumn擎 TableView曖 getColumn().get(檣策蝶)煎 橢橫 頂朝等, 羅 廓簞 鏽歲曖 檣策蝶朝 0檜棻. 
	// TableColumn曖 setCellValueFactory() 詭模萄朝 衙偃高戲煎 薯奢腎朝 PropertyValueFactory("賅筐樓撩貲")擊 檜辨п憮 賅筐 樓撩高擊 TableColumn 高戲煎 撮たи棻.
	// 棻擠擎 羅 廓簞 TableColumn擊 賅筐 贗楚蝶曖 smartPhone 樓撩婁 翱唸衛酈朝 囀萄檜棻.
	
	//	TableColumn tcSmartPhone = tableView.getColumn().get(0);
	//	tcSmartPhone.setCellValueFactory( new PropertyValueFactory("smartPhone") );
	
	// 撚(cell) 頂縑憮 薑溺檜 в蹂и 唳辦縑朝 棻擠婁 偽檜 TableColumn曖 setStyle() 詭模萄煎 CSS蒂 瞳辨ж賊 脹棻. CSS 17.10 JavaFX CSS 蝶顫橾縑憮 з蝗и棻.
	
	//	tcSmartPhone.setStyle("-fx-alignment: CENTER;");
	
	// 葆雖虞戲煎 ч曖 等檜攪蒂 輿晦 嬪п ObservableList縑 賅筐 偌羹菟擊 棻擠婁 偽檜 盪濰ж堅, ObservableList蒂 衙偃高戲煎 п憮 TableView曖 setItems() 詭模萄蒂 ��轎ж罹 ч菟擊 蹺陛и棻.
	
	//	ObservableList phoneList = FXCollections.observableArrayList(
	//		new Phone("偉楣衛S1", "phone01.png"),
	//		new Phone("偉楣衛S2", "phone02.png"),
	//		new Phone("偉楣衛S3", "phone03.png"),
	//	);
	//	tableView.setItems(phoneList);
	
	// TableView縑憮 摹鷗脹 ч曖 檣策蝶諦 賅筐 偌羹蒂 橢戲溥賊 樓撩 馬衛蒂 檜辨й 熱 氈棻. getSelectionModel() 詭模萄煎 TableViewSelectionModel擊 橢堅 釭憮,
	// selectedIndexProperty 傳朝 selectedItemProperty縑 葬蝶傘蒂 撲薑ж賊 脹棻. selectedIndexProperty朝 摹鷗脹 ч曖 檣策蝶檜堅, selectedItemProperty朝 摹鷗脹 ч曖 賅筐 偌羹檜棻.
	// 棻擠擎 selectedItemProperty縑 葬蝶傘蒂 撲薑ж朝 囀萄檜棻.
	
	//	tableView.getSelectionModel().selectedItemProperty().addListener(
	//		new ChangeListener<Phone>() {
	//			@Override
	//			public void changed(ObservableValue<? extends Phone> observable,
	//								Phone oldValue, Phone newValue) {...}
	//		}
	//	);
	
	// 棻擠 蕨薯朝 ListView曖 о跡擊 摹鷗ж賊 偽擎 檣策蝶蒂 陛雖朝 TableView曖 ч檜 濠翕 摹鷗腎紫煙 и棻.
	// 斜葬堅 TableView縑憮 ч檜 摹鷗腎賊 檜嘐雖 鏽歲 高擊 檗堅 ImageView縑 檜嘐雖蒂 爾罹遽棻. ж欽曖 [�挫垚 幗が擊 贗葛ж賊 ListView諦 TableView縑 摹鷗脹 薑爾蒂 夔樂縑 轎溘и棻.
	
			//	Media Control
	
	// 嘐蛤橫 鐘お煤縑朝 綠蛤螃蒂 營儅й 熱 氈朝 MediaView 鐘お煤婁 獐睞 褻瞰 塽 營儅 嬪纂 褻瞰擊 嬪и Slider 鐘お煤 斜葬堅 ⑷營 霞ч 鼻鷓蒂 爾罹輿朝 ProgressBar, ProgressIndicator 鐘お煤檜 氈棻.
	// Slider諦 ProgressBar, ProgressIndicator朝 嘐蛤橫諦朝 鼻婦橈檜 棻艇 辨紫煎 餌辨й 熱 氈棻.
	// 蕨蒂 菟橫 ProgressBar諦 ProgressIndicator朝 啻お錶觼 等檜攪 歎熱褐 薑紫蒂 ル衛й 陽縑紫 餌辨й 熱 氈棻.
	
	//								MediaView
	//			忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖
	//			弛												弛
	//			弛	 											弛
	//			弛					翕艙鼻						弛
	//			弛												弛
	//			弛												弛
	//			弛												弛
	//			戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎
	//
	//				Slider											ProgressBar諦 ProgressIndicator
	//						
	//	Track		Thumb	Block increment							progress: 0.0 ﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤	0%
	//	⊿			⊿	  	 弛 ㏒弛	
	//	忙式式式式式式式式式式式≒式式式式式式式式式式式忖									progress: 0.6 ﹥﹥﹥﹥﹥﹥﹤﹤﹤﹤	60%
	//	戌式式式式式式式式式式式式式式式式式式式式式式式戎
	//	忙式式成式式成式式成式式成式式成式式成式式成式式忖									progress: 1.0 ﹥﹥﹥﹥﹥﹥﹥﹥﹥﹥	100%
	//	0			50.0		100
	//			Tick marks		∟ Tick Label
	
			/*	MediaPlayer And MediaView Control	*/
	
	// MediaView 鐘お煤擎 綠蛤螃蒂 爾罹輿朝 辨紫煎虜 餌辨腎晦 陽僥縑 か滌и UI蒂 陛雖堅 氈雖 彊棻. 欽雖, 溯檜嬴醒鼻縑憮 綠蛤螃陛 嬪纂й 艙羲擊 ル衛и棻. 
	// FXML煎 MediaView 鐘お煤擊 摹樹ж朝 寞徹擎 棻擠婁 偽棻.
	
	//	<MediaView fitHeight="200.0" fitWidth="300.0" preserveRatio="false" />
	
	// fitWidth諦 fitHeight朝 MediaView曖 ァ婁 堪檜蒂 雖薑и棻. preserveRatio 樓撩擎 綠蛤螃曖 陛煎-撮煎綠蒂 嶸雖й 匙檣雖蒂 雖薑ж朝等, false蒂 輿賊 綠蛤螃曖 陛煎-撮煎綠諦 鼻婦橈檜
	// fitWidth諦 fitHeight縑 蜃啪 MediaView曖 觼晦陛 褻薑腎堅, true蒂 輿賊 綠蛤螃曖 陛煎綠諦 撮煎綠蒂 嶸雖ж晦 嬪п MediaView 觼晦陛 褻薑脹棻.
	// MediaView 鐘お煤擎 綠蛤螃蒂 營儅ж朝 晦棟檜 橈晦 陽僥縑 嘐蛤橫蒂 營儅ж朝 MediaPlayer陛 氈橫撿 и棻.
	// MediaPlayer朝 綠蛤螃閨虜 嬴棲塭 螃蛤螃紫 營儅ж朝 晦棟擊 陛雖堅 氈朝等, 嘐蛤橫 模蝶 唳煎蒂 Media 偌羹 ⑽鷓煎 瞪殖п憮 棻擠婁 偽檜 儅撩и棻.
	
	//	Media media = new Media("嘐蛤橫 模蝶 唳煎");
	//	MediaPlayer mediaPlayer = new MediaPlayer(media);
	
	// 虜擒 綠蛤螃諦 螃蛤螃 だ橾檜 贗楚蝶 唳煎縑 氈棻賊 Media蒂 儅撩й 陽 棻擠婁 偽檜 鼻渠 唳煎蒂 餌辨ж朝 匙檜 謠棻.
	
	//	Media media = new Media(getClass().getResource("media/bigbuck.m4v").toString());
	//	MediaPlayer mediaPlayer = new MediaPlayer(media);
	
	// 嘐蛤橫 模蝶陛 綠蛤螃塭賊 MediaView曖 setMediaPlayer() 詭模萄煎 mediaPlayer 偌羹蒂 蛔煙й 熱 氈棻. 螃蛤螃 模蝶煎睡攪 MediaPlayer陛 儅撩腎歷棻賊 MediaView朝 в蹂 橈棻.
	
	//	mediaView.setMediaPlayer(mediaPlayer);
	
	// MediaPlayer蒂 儅撩ц棻堅 п憮 夥煎 營儅й 熱朝 橈堅, 營儅й 鼻鷓(READY)陛 腆 陽梱雖 晦棻溥撿 и棻.
	// 棻擠擎 MediaPlayer陛 陛韓 熱 氈朝 鼻鷓諦 鼻鷓蒂 滲唳ж朝 詭模萄陛 鼠歙檣雖 爾罹遽棻.
	
	//	⑷營 鼻鷓\棻擠 鼻鷓		READY		PAUSED						PLAYING			STALLED			STOPPED
	//	
	//	UNKNOWN			
	//	
	//	READY							setAutoPlay(true).play()
	//	
	//	PAUSED							play()														stop()
	//	
	//	PLAYING							paused()									buffering data	stop()
	//
	//	STALLED							paused()					buffering data					stop()
	//
	//	STOPPED							paused()					play()
	
	// UNKNOWN擎 Mediaplayer陛 儅撩脹 霜�釋� 鼻鷓檣等, 嘐蛤橫 模蝶蒂 營儅й 遽綠陛 腎賊 READY 鼻鷓煎 濠翕 滲唳脹棻.
	// READY 鼻鷓縑憮 setAutoPlay(true) 傳朝 play()蒂 ��轎ж賊 PLAYING檜 脹棻. PLAYING 鼻鷓陛 腎堅, stop()擊 ��轎ж賊 STOPPED檜 脹棻.
	// 虜擒 PLAYING 鼻鷓縑憮 營儅 幗ぷ縑 醱碟и 等檜攪陛 橈擊 唳辦 STALLED 鼻鷓陛 脹棻. 輿煎 啻お錶觼鼻縑憮 嘐蛤橫 模蝶蒂 嫡嬴 營儅й 陽, 啻お錶觼 樓紫陛 替葬賊 STALLED 鼻鷓陛 脹棻.
	// 檜 鼻鷓菟擎 MediaPlayer.Status 翮剪 顫殮戲煎 賅舒 薑曖腎橫 氈朝等, 囀萄縑憮 MediaPlayer曖 鼻鷓蒂 憲堅 談棻賊 getStatus()曖 葬欐高擊 �挫恉牉� 脹棻.
	
	//				UNKNOWN
	//				   ⊿
	//				READY
	//				   ⊿
	//		忙式式式式式⊥	PLAYING ∠式式式式式式式忖
	//		⊿		   ⊿			⊿
	//	STALLED	 ⊥	PAUSED	 ⊥	STOPPED
	
	// 嬪曖 ル縑朝 釭諦 氈雖 彊雖虜 и 陛雖 鼻鷓蒂 渦 憲嬴萃 в蹂陛 氈棻. 夥煎 EndOfMedia檜棻. EndOfMedia朝 MediaPlayer陛 嘐蛤橫 模蝶蒂 賅舒 營儅ц擊 陽曖 鼻鷓蒂 蜓и棻.
	// EndOfMedia 鼻鷓縑憮 play()蒂 ��轎ж賊 棻衛 PLAYING 鼻鷓陛 腆 熱 氈朝等, 試盪 seek() 詭模萄煎 營儅 嬪纂蒂 籀擠戲煎 腎給溥撿 и棻.
	
	// 鼻鷓陛 滲唳腎賊 濠翕 褒чп撿 й 囀萄菟檜 氈擊 熱 氈棻. 檜楛 囀萄菟擎 Runnable曖 run() 詭模萄縑 濛撩ж堅, setOnXXX() 詭模萄煎 蛔煙ж賊 脹棻.
	// 斜楝賊 п渡 鼻鷓陛 腎歷擊 陽 Runnable曖 run() 詭模萄陛 濠翕 褒ч脹棻. 棻擠擎 陝 鼻鷓煎 滲唳腆 陽 褒чж朝 Runnable擊 撲薑ж朝 詭模萄檜棻.
	
	//	鼻鷓			濠翕 褒ч Runnable 撲薑 詭模萄		Runnable縑 んл腆 熱 氈朝 囀萄
	//
	//	READY		setOnReady(Runnable r)		- currentTime 樓撩擊 馬衛
	//											- 營儅 衛除擊 ル衛ж朝 葬蝶傘 蛔煙
	//											- 營儅 幗が �側瘓�
	//
	//	PLAYING		setOnPlaying(Runnable r)	- 誇辭 塽 薑雖 幗が �側瘓�
	//
	//	PAUSED		setOnPlaying(Runnable r)	- 營儅 塽 薑雖 幗が �側瘓�
	//
	//	STOPPED		setOnStopped(Runnable r)	- 營儅 幗が �側瘓�
	//
	//	EndOfMedia	setOnEndOfMedia(Runnable r)	- 營儅 幗が �側瘓�
	
	// 棻擠擎 setOnReady() 詭模萄蒂 濛撩ж朝 寞徹擊 爾罹遽棻. MediaPlayer縑憮 currentTime 樓撩擊 馬衛ж朝 ChangeListener蒂 蛔煙ц朝等, 
	// changed() 詭模萄縑朝 營儅 衛除擊 ル衛ж朝 囀萄菟檜 濛撩腆 熱 氈棻. в蹂ж棻賊 READY 鼻鷓縑憮 PLAYING 鼻鷓煎 滲唳ж晦 嬪п 營儅 幗が擊 �側瘓倆炴� 囀萄蒂 濛撩п撿 и棻.
	// 虜擒 營儅 幗が擊 餌辨ж雖 彊堅 濠翕 褒ч擊 ж堅 談棻賊 setAutoPlay(true)蒂 ��轎п撿 и棻.
	
	//	mediaPlayer.setOnReady(new Runnable() {
	//		@Override
	//		public void run() {
	//			mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
	//				@Override
	//				public void changed(ObservableValue<? extends Duration> observable, 
	//									Duration oldValue, Duration newValue) {
	//					// 營儅 衛除擊 ル衛ж朝 囀萄
	//				}
	//			});
	//			// 營儅 幗が擊 �側瘓� 囀萄 囀萄 setAutoPlay(true);
	//		}
	//	});
	
	// 棻擠擎 綠蛤螃諦 螃蛤螃蒂 營儅ж朝 除欽и Ы溯檜橫蒂 虜菟橫 爾懊棻. RootController曖 塭檣婁 塭檣擊 廓陞嬴陛貊 輿戮擊 п薯ж堅 褒ч衛麵爾濠.
	
			/*	Slider Control	*/
	
	//				Slider									
	//						
	//	Track		Thumb	Block increment		
	//	⊿			⊿	  	 弛 ㏒弛	
	//	忙式式式式式式式式式式式≒式式式式式式式式式式式忖	
	//	戌式式式式式式式式式式式式式式式式式式式式式式式戎
	//	忙式式成式式成式式成式式成式式成式式成式式成式式忖	
	//	0			50.0		100
	//			Tick marks		∟ Tick Label
	
	// Slider 鐘お煤擎 Track婁 Thumb煎 掘撩腎橫 氈棻. Slider曖 value 樓撩縑朝 ⑷營 Thumb曖 嬪纂高檜 盪濰腎朝等, 譆模高擎 0, 譆渠高擎 100檜棻.
	// 晦獄瞳戲煎 Tick marks諦 Tick label檜 獗啖螳 氈朝等, setShowTickMarks(true)諦 setShowTickLabel(true)蒂 ��轎ж賊 獐 熱 氈棻.
	// Block increment 除問擎 setBlockIncrement()煎 撲薑й 熱 氈棻
	// 棻擠擎 FXML煎 Slider 鐘お煤擊 摹樹ж朝 寞徹擊 爾罹遽棻.
	
	//	<Slider prefHeight="堪檜" prefWidth="ァ" showTickLabels="true" showTickMarks="true" />
	
	// 棻擠擎 MediaPlayer曖 獐睞擊 褻薑ж晦 嬪п Slider 鐘お煤曖 value 樓撩擊 馬衛ж朝 ChangeListener蒂 蛔煙и棻.
	// MediaPlayer曖 volume 樓撩擎 0.0 ~ 1.0 高擊 陛雖朝等, Slider value 樓撩擎 0.0 ~ 100.0 高擊 陛雖嘎煎 Slider曖 value 樓撩高擊 100.0戲煎 釭援橫憮
	// MediaPlayer曖 value 樓撩高戲煎 撲薑п撿 и棻.
	
	//	sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {
	//		@Override
	//		public void changed(ObservableValue<? extends Number> observable,
	//								Number oldValue, Number newValue) {
	//			mediaPlayer.setVolume(sliderVolume.getValue() / 100.0);
	//		}
	//	});
	
			/*	ProgressBar And ProgressIndicator Control	*/
	
	//		ProgressBar諦 ProgressIndicator
	//						
	//	progress: 0.0 ﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤	0%
	//	
	//	progress: 0.6 ﹥﹥﹥﹥﹥﹥﹤﹤﹤﹤	60%
	//
	//	progress: 1.0 ﹥﹥﹥﹥﹥﹥﹥﹥﹥﹥	100%
	
	// ProgressBar朝 熱ゎ 虞渠 賅曄曖 鐘お煤檜堅, ProgressIndicator朝 錳⑽ 賅曄曖 鐘お煤檜棻. 
	// 萃 棻 濛機曖 霞ч 薑紫蒂 ル衛ж朝等, 嘐蛤橫 營儅 衛除擊 ル衛ж剪釭, 盪濰模曖 餌辨榆 塽 啻お錶觼 鱔褐榆擊 ル衛й 陽紫 餌辨й 熱 氈棻.
	// 棻擠擎 FXML煎 摹樹ж朝 寞徹擊 爾罹遽棻.
	
	//	<ProgressBar prefHeight="15" prefWidth="100" progress="0.0" />
	//	<ProgressIndicator prefHeight="47.0" prefWidth="31.0" progress="0.0" />
	
	// ProgressBar朝 ProgressIndicator蒂 鼻樓и ж嬪 鐘お煤檜晦 陽僥縑 餌辨ж朝 樓撩菟檜 賅舒 翕橾ж棻. progress 樓撩擎 霞ч 薑紫蒂 撲薑ж朝等, 譆模高擎 0.0檜堅 譆渠高擎 1.0檜棻.
	// 霞ч 薑紫朝 濠夥 囀萄煎 棻擠婁 偽檜 滲唳й 熱 氈棻.
	
	//	progressBar.setProgress(0.0 ~ 1.0);
	//	progressIndicator.setProgress(0.0 ~ 1.0);
	
	// MediaPlayer曖 營儅 衛除擊 釭顫頂晦 嬪п憮朝 ⑷營 營儅 衛除擊 瞪羹 營儅 衛除戲煎 釭換高擊 progress 樓撩高戲煎 撲薑ж賊 脹棻.
	
	//	double progress = 
	//	mediaPlayer.getCurrentTime().toSeconds()	// mediaPlayer.getTotalDuration().toSeconds();
	//	progressBar.setProgress(progress);
	//	progressIndicator.setProgress(progress);
	
	// 輿曖й 薄擎 葆雖虞 營儅 衛除婁 瞪羹 營儅 衛除檜 薑�旅� 橾纂ж雖 彊晦 陽僥縑 葆雖虞 高檜 1.0檜 腎雖 彊擊 熱紫 氈棻. 
	// 斜楚憮 MediaPlayer陛 EndOfMedia 鼻鷓陛 腎歷擊 陽 progress 樓撩擊 鬼薯煎 1.0戲煎 撲薑ж朝 匙檜 謠棻.
	
	//	MediaPlayer.setOnEndOfMedia( () -> {
	//		progressBar.setProgress(1, 0);
	//		progressIndicator.setProgress(1, 0);
	//	}
	
	// 棻擠擎 檜瞪 蕨薯曖 嘐蛤橫 Ы溯檜橫蒂 偃摹п憮 營儅 衛除擊 ル衛ж紫煙 ProgressBar諦 ProgressIndicator 鐘お煤擊 蹺陛ж堅, 獐睞擊 褻薑ж晦 嬪п Slider 鐘お煤擊 蹺陛и棻.
	
			/*	Chart Control	*/
	
	// JavaFX縑朝 棻擠婁 偽檜 棻曄и 離お蒂 儅撩ж朝 鐘お煤擊 薯奢п遽棻. 檜 離お曖 鐘お煤菟擎 javafx.scene.chart ぬ酈雖縑 んл腎橫 氈棻.
	
	//		PieChart				LineChart			AreaChart
	//
	//	Apple ∠	〣 ⊥ Orange		弛收收收收收收收旬			弛
	//	∞ Apple	≒ Orange		弛式式式忖	曲收收收收收		弛式式式式式式式式
	//							弛	戌式式式式式			弛﹥﹥﹥﹥﹥﹥﹥﹥
	//							戌式式式式式式式式式式式式式式		戌式式式式式式式式式
	//
	//		BarChart				BubbleChart			ScatterChart
	//
	//	弛忙忖						弛	≒				弛≒		≒		≒
	//	弛弛弛忙忖					弛≒					弛	≒	≒	≒≒
	//	弛弛弛弛弛					弛		≒			弛≒	≒≒≒	≒		≒
	//	戌式式式式式式式式式式式式			戌式式式式式式式式式式式式式式		戌式式式式式式式式式式式式式式式式
	
	// FXML煎 離お 鐘お煤擊 寡纂ж朝 寞徹擎 衙辦 蓮遴等, PieChart橾 唳辦 棻擠婁 偽檜 濛撩ж賊 脹棻. PieChart朝 X蹴婁 Y蹴檜 橈戲嘎煎 蹴戲煎 薑曖й в蹂陛 橈棻
	
	//	<PieChart/>
	
	// LineChart, AreaChart, BarChart橾 唳辦 X蹴婁 Y蹴檜 в蹂ж嘎煎 蹴 薑曖陛 в蹂ж棻. 棻擠擎 BarChart蒂 摹樹ж朝 寞徹擊 爾罹遽棻.
	// <xAxis>諦 <yAxis>朝 陝陝 X蹴, Y蹴擊 蜓и棻. X蹴擎 嬪薹, 嬴楚薹檜 氈堅, Y蹴擎 豭薹婁 螃艇薹檜 氈晦 陽僥縑 換旎檜 釭顫陳 嬪纂蒂 雖薑п撿 и棻.
	// <CategoryAxis side="BOTTOM" />擎 碟盟 換旎擊 嬴楚薹 蹴縑 釭顫魚棻. <NumberAxis side="LEFT" />朝 璋濠 換旎擊 豭薹 蹴縑 釭顫魚棻.
	
	//	<BarChart>
	//		<xAxis>
	//			<CategoryAxis side="BOTTOME" />
	//		</xAxis>
	//		<yAxis>
	//			<NumberAxis side="LEFT" />
	//		</yAxis>
	//	</BarChart>
	
	// 鐘お煤楝朝 離お曖 等檜攪蒂 等檜攪漆檜蝶釭 啻お錶觼縑憮 瞪殖嫡嬴憮 離お 鐘お煤縑 蹺陛п撿 ж朝等, 棻擠擎 PieChart縑 等檜攪蒂 蹺陛ж朝 寞徹擊 爾罹遽棻.
	// 陝陝曖 等檜攪朝 PieChart.Data 偌羹煎 儅撩ж堅, 檜匙擊 ObservableList縑 盪濰и 棻擠 PieChart曖 setData() 衙偃高戲煎 薯奢ж賊 脹棻.
	
	// 	pieChart.setData(FXCollections.observableArrayList(
	//		new PireChart.Data("AWT", 10),
	//		new PireChart.Data("Swing", 30),
	//		new PireChart.Data("SWT", 25),
	//		new PireChart.Data("JavaFX", 35)
	//	)};
	
	// X蹴婁 Y蹴檜 в蹂и LineChart, AreaChart, BarChart朝 等檜攪蒂 蹺陛ж朝 寞徹檜 賅舒 翕橾ж棻.
	// 棻擠擎 BarChart縑 等檜攪蒂 蹺陛ж朝 寞徹擊 爾罹遽棻.
	
	//	XYChart.Series series1 = new XYChart.Series();		// 衛葬鍔 儅撩
	//	series1.setName("陴濠");
	//	series1.setData(FXCollections.observableArrayList(
	//		new XYChart.Data("2015", 70),
	//		new XYChart.Data("2016", 40),
	//		new XYChart.Data("2017", 50),
	//		new XYChart.Data("2018", 30)
	//	));
	//	barChart.getData().add(series1);
	
	// XYChart.Series朝 ж釭曖 斜楚Щ蒂 曖嘐и棻. 罹楝 偃曖 斜楚Щ蒂 啜藥 爾檜啪 ж溥賊 XYChart.Series蒂 斜楚Щ曖 熱縑 蜃啪 儅撩п憮 蹺陛ж賊 脹棻.
	// 蹴曖 等檜攪朝 XYChart.Data 偌羹煎 儅撩ж堅, 檜匙擊 ObservableList縑 盪濰и 棻擠 XYChart.Series曖 setData() 衙偃高戲煎 薯奢ж賊 脹棻.
	// XYChart.Series陛 諫撩腎賊 離お曖 getData()蒂 ��轎п憮 橢擎 ObservableList縑 蹺陛л戲煎賦 ж釭曖 斜楚Щ陛 儅撩脹棻.
	// 棻擠 蕨薯朝 PieChart, BarChart, AreaChart蒂 儅撩ж朝 寞徹擊 爾罹遽棻.
	//
	//
}
