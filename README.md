# 爱医 Android和iOS支持的html标签

Android使用的是 github上 zzhoujay/RichText（2.6k stars）
链接地址：https://github.com/zzhoujay/RichText

iOS使用的是 github上 Cocoanetics/DTCoreText（5.6k stars）
链接地址：https://github.com/Cocoanetics/DTCoreText

### 值支持的所有的CSS
style里面支持的属性参照
- text-align(支持 left center right)
- color （支持 #ff0000）
- background（支持 #ff0000）
- text-decoration（支持 line-through 删除线）
- text-indent（缩进 例如：50px）
- font-size（例如：20px）

### 支持的HTML标签

- br标签

```
你好<br/>我是br标签
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/br.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/br.png) 

- p标签 支持style（支持CSS属性：color、font-size、text-align、background-color、text-decoration、text-indent）
```
<p style=\"color:#ff0000; font-size:20px; text-align:right; background-color:#00FF00; text-decoration:line-through\">这是一个段落。</p><p>这是另外一个段落。</p><p style=\"text-indent:50px\">这是另外一个段落。</p>
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/p.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/p.png) 

- ul标签 支持style(由于Android不支持 ol iOS支持 所以就没有写)
- li标签 支持style（支持CSS属性：color、font-size、text-align、background-color、text-decoration）

```
<ul><li style=\"color:#ff0000; font-size:20px; text-align:right; background-color:#00FF00; text-decoration:line-through\">Coffee</li  style=\"text-indent:50px\"><li>Milk</li></ul> <ol><li>Coffee</li><li>Milk</li></ol> 
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/ul_ol_li.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/ul_ol_li.png) 

- div标签 支持style（支持CSS属性：color、font-size、text-align、background-color）

```
<div style="color:#ff0000; font-size:20px; background-color:#00FF00"><h3>这是一个在div元素中的标题</h3><p>这是一个在div元素中的文本</p></div><div style="color:#00ff00; font-size:20px; text-align:right; background-color:#FF0000">这是一个在div元素</div>
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/div.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/div.png) 

- span标签 支持style(color、background、text-decoration、font-size)
```
<span style="color:#ff0000; font-size:20px; background-color:#00FF00; text-decoration:line-through">强调文本</span>非强调文本
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/span.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/span.png) 

- strong标签 支持style(color、background、text-decoration、font-size)
```
<strong style=\"color:#ff0000; font-size:20px; background-color:#00FF00; text-decoration:line-through\">加粗文本</strong>非加粗文本
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/strong.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/strong.png) 

- b标签 支持style(color、background、text-decoration、font-size)
```
<b style="color:#ff0000; font-size:20px; background-color:#00FF00; text-decoration:line-through">加粗文本b标签</b>非加粗文本
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/b.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/b.png) 

- i标签 支持style(color、background、text-decoration、font-size)
```
<p>He named his car <i>The lightning</i>, The lightning because it<i  style=\"color:#ff0000; font-size:20px; background-color:#00FF00; text-decoration:line-through\"> was very fast</i>.</p>
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/i.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/i.png) 

- small标签 支持style(color、background、text-decoration、font-size)
```
<small style="color:#ff0000; background-color:#00FF00; text-decoration:line-through">这个文本比较小</small>这个文本比较小
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/small.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/small.png) 

- font标签 支持(color、face)(**HTML5 不支持 <font> 标签。请用 CSS 代替。在 HTML 4.01 中，<font> 元素已废弃**)
```
<font size=\"3\" color=\"#FF0000\">这是一些文本！</font> <font size=\"2\" color=\"#0000FF\">这是一些文本！</font> <font face=\"verdana\" color=\"#00FF00\">这是一些文本！</font>
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/font.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/font.png) 

- blockquote标签 支持style（text-align、text-indent）
```
<blockquote cite=\"http://www.worldwildlife.org/who/index.html\">For 50 years, WWF has been protecting the future of nature. The world's leading conservation organization, WWF works in 100 countries and is supported by 1.2 million members in the United States and close to 5 million globally.</blockquote><br/>For 50 years, WWF has been protecting the future of nature. The world's leading conservation organization, WWF works in 100 countries and is supported by 1.2 million members in the United States and close to 5 million globally. 
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/blockquote.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/blockquote.png) 

- a标签 支持style(background、text-decoration、font-size)
```
<a style="color:#ff0000; background-color:#00FF00; font-size:20px; text-decoration:line-through" href="http://www.w3cschool.cn">这是一个链接</a>
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/a.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/a.png) 

- u标签
```
<p>This is a <u>parragraph</u>.</p>
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/u.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/u.png) 

- del标签
```
<p>My <del>favorite color is blue</del></p>
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/del.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/del.png) 

- s标签
```
<p><s>我的车是蓝色的。</s></p><p>我的新车是银色的。</p>
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/s.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/s.png) 

- strike标签(**HTML strike 标签 - HTML5 不支持**)
```
<p>Version 2.0 is <strike>not yet available!</strike> now available!</p>
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/strike.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/strike.png) 

- sup标签
```
<p>This text contains <sup>superscript</sup> text.</p>
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/sup.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/sup.png) 

- sub标签
```
<p>This text contains <sub>subscript</sub> text.</p>
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/sub.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/sub.png) 

- h1-h6标签 支持style（text-align、text-indent）
```
<h1>这是一个h1标题</h1><h2>这是一个h2标题</h2><h3>这是一个h3标题</h3><h4>这是一个h4标题</h4><h5>这是一个h5标题</h5><h6>这是一个h6标题</h6>
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/h1_h6.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/h1_h6.png) 

- img标签 支持width height
```
<img src="https://desk-fd.zol-img.com.cn/t_s640x530c5/g5/M00/02/05/ChMkJlbKyaGIGGNjABT85XemdQ8AALIQQI-6pcAFPz9490.jpg" width="104" height="142">
```

Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/img.jpg)  | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/img.png) 

- code标签
- 整体的例子1

```
<span style="font-size:18px">微信支付凭证</span><br/>
<div style="text-align:center">
    <span style="font-size:14px; color:grey">付款金额</span><br/>
<strong><span style="text-align:center; font-size:22px; text-align:center;">¥16.94</span></strong></div><br/>
<span style="color:grey; font-size:14px">收款方　　</span> 
<span style="font-size:16px"></span>丁少波<br/>
<span style="color:grey; font-size:14px">交易状态　</span> 
<span style="font-size:16px"></span>支付成功，对方已首款<br/><br/>
查看账单详情<br/>
```
Android | iOS
---|---
![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/Android/demo1.jpg) | ![image](https://github.com/Wisdozzh/markdown-images/blob/master/Html%20parser/iOS/demo1.png)




