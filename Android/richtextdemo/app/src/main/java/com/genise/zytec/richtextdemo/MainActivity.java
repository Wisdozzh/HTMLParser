package com.genise.zytec.richtextdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.zzhoujay.richtext.RichText;
import com.zzhoujay.richtext.callback.OnUrlClickListener;

public class MainActivity extends AppCompatActivity {
    private static final String html = "<article class=\"markdown-body entry-content\" itemprop=\"text\"><h1><a href=\"#richtext\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-richtext\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>RichText</h1>\n" +
            "<blockquote>\n" +
            "<p style=\"background-color:rgba(255,0,0,1);\">Android平台下的富文本解析器</p>\n" +
            "</blockquote>\n" +
            "<ul>\n" +
            "<li>流式操作</li>\n" +
            "<li>低侵入性</li>\n" +
            "<li>依赖少，只依赖了<code>disklrucache</code>和<code>support v4</code></li>\n" +
            "<li>支持Html和Markdown格式文本</li>\n" +
            "<li>支持图片点击和长按事件</li>\n" +
            "<li>链接点击事件和长按事件</li>\n" +
            "<li>支持设置加载中和加载错误时的图片</li>\n" +
            "<li>支持自定义超链接的点击回调</li>\n" +
            "<li>支持修正图片宽高</li>\n" +
            "<li>支持GIF图片</li>\n" +
            "<li>支持Base64编码、本地图片和Assets目录图片</li>\n" +
            "<li>自持自定义图片加载器、图片加载器</li>\n" +
            "<li>支持内存和磁盘双缓存</li>\n" +
            "</ul>\n" +
            "<h3><a href=\"#效果\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-效果\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>效果</h3>\n" +
            "<p><a href=\"/zzhoujay/RichText/blob/master/image/image.jpg\" target=\"_blank\"><img src=\"/zzhoujay/RichText/raw/master/image/image.jpg\" alt=\"演示\" title=\"演示\" style=\"max-width:100%;\"></a></p>\n" +
            "<h3><a href=\"#gradle中引用的方法\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-gradle中引用的方法\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>gradle中引用的方法</h3>\n" +
            "<pre><code>compile 'com.zzhoujay.richtext:richtext:3.0.5'\n" +
            "</code></pre>\n" +
            "<h3><a href=\"#关于issue\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-关于issue\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>关于issue</h3>\n" +
            "<p style=\"text-indent:50px;\">最近一段时间会比较忙，issue不能及时处理，一般会定时抽空集中解决issue，但时间有限解决速度上不敢保证。</p>\n" +
            "<p>欢迎提交pull request帮助完善这个项目</p>\n" +
            "<h3><a href=\"#注意\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-注意\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>注意</h3>\n" +
            "<p>在第一次调用RichText之前先调用<code>RichText.initCacheDir()</code>方法设置缓存目录</p>\n" +
            "<p>ImageFixCallback的回调方法不一定是在主线程回调，注意不要进行UI操作</p>\n" +
            "<p>本地图片由根路径<code>\\</code>开头，Assets目录图片由<code>file:///android_asset/</code>开头</p>\n" +
            "<p>Gif图片播放不支持硬件加速，若要使用Gif图片请先关闭TextView的硬件加速</p>\n" +
            "<pre><code>textView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);\n" +
            "</code></pre>\n" +
            "<h3><a href=\"#使用方式\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-使用方式\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>使用方式</h3>\n" +
            "<p><a href=\"https://github.com/zzhoujay/RichText/wiki\">多看wiki</a>、<a href=\"https://github.com/zzhoujay/RichText/wiki\">多看wiki</a>、<a href=\"https://github.com/zzhoujay/RichText/wiki\">多看wiki</a>，重要的事情说三遍</p>\n" +
            "<h3><a href=\"#后续计划\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-后续计划\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>后续计划</h3>\n" +
            "<ul>\n" +
            "<li><del>添加自定义标签的支持</del> (已添加对少部分自定义标签的支持)</li>\n" +
            "</ul>\n" +
            "<h3><a href=\"#关于markdown\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-关于markdown\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>关于Markdown</h3>\n" +
            "<p>Markdown源于子项目：<a href=\"https://github.com/zzhoujay/Markdown\">Markdown</a></p>\n" +
            "<p>若在markdown解析过程中发现什么问题可以在该项目中反馈</p>\n" +
            "<h3><a href=\"#富文本编辑器\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-富文本编辑器\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>富文本编辑器</h3>\n" +
            "<p>编辑功能目前正在开发中，<a href=\"https://github.com/zzhoujay/RichEditor\">RichEditor</a></p>\n" +
            "<h3><a href=\"#具体使用请查看demo\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-具体使用请查看demo\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>具体使用请查看demo</h3>\n" +
            "<p><a href=\"https://github.com/zzhoujay/RichText/blob/master/app/src/main/java/zhou/demo/ListViewActivity.java\">ListView Demo</a>、\n" +
            "<a href=\"https://github.com/zzhoujay/RichText/blob/master/app/src/main/java/zhou/demo/RecyclerViewActivity.java\">RecyclerView Demo</a>、\n" +
            "<a href=\"https://github.com/zzhoujay/RichText/blob/master/app/src/main/java/zhou/demo/GifActivity.java\">Gif Demo</a></p>\n" +
            "<h3><a href=\"#license\" aria-hidden=\"true\" class=\"anchor\" id=\"user-content-license\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"></path></svg></a>License</h3>\n" +
            "<pre><code>The MIT License (MIT)\n" +
            "\n" +
            "Copyright (c) 2016 zzhoujay\n" +
            "\n" +
            "Permission is hereby granted, free of charge, to any person obtaining a copy\n" +
            "of this software and associated documentation files (the \"Software\"), to deal\n" +
            "in the Software without restriction, including without limitation the rights\n" +
            "to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\n" +
            "copies of the Software, and to permit persons to whom the Software is\n" +
            "furnished to do so, subject to the following conditions:\n" +
            "\n" +
            "The above copyright notice and this permission notice shall be included in all\n" +
            "copies or substantial portions of the Software.\n" +
            "\n" +
            "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
            "\n" +
            "IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n" +
            "FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n" +
            "AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n" +
            "LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\n" +
            "OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE\n" +
            "SOFTWARE.\n" +
            "</code></pre>\n" +
            "<p><em>by zzhoujay</em></p>\n" +
            "</article>";

    private static final String html2 = "<div style=\"background-color:red\">\n" +
            "<H1>Divisions/部分</H1>\n" +
            "DIV元素在HTML 3.2中有定义，但HTML 3.2中只有ALIGN属性能兼容。HTML 4.0在属性中加入CLASS、STYLE、和ID属性。\n" +
            "因为DIV可以包含其他块级集成，在用于建立文档的大型章节例如本备注是很有用的。\n" +
            "要求关闭标记。" +
            "</div>\n" +
            "<div style=\"background-color:green\">\n" +
            "DIV元素在HTML 3.2中有定义，但HTML 3.2中只有ALIGN属性能兼容。HTML 4.0在属性中加入CLASS、STYLE、和ID属性。\n" +
            "因为DIV可以包含其他块级集成，在用于建立文档的大型章节例如本备注是很有用的。\n" +
            "要求关闭标记。\n" +
            "</div>";

    private static final String wechatPayResult1 = "<img src=\"http://www.w3school.com.cn/i/eg_tulip.jpg\"  width=\"20\" height=\"20\" alt=\"上海鲜花港 - 郁金香\" />上海蜡渣xxx<br/>\n<p style=\"text-align:center\">付款金额</p>\nh1 style=\"text-align:center\">¥16.94</h1>\n查看账单详情";
    private static final String wechatPayResult11 = "<img src=\"http://www.w3school.com.cn/i/eg_tulip.jpg\"  width=\"20\" height=\"20\" alt=\"上海鲜花港 - 郁金香\" />上海蜡渣xxx<br/>\n" +
            "<p style=\"text-align:center\">付款金额</p>\n" +
            "<h1 style=\"text-align:center\">¥16.94</h1>\n" +
            "查看账单详情";

    private static final String wechatPayResult2 = "<span style=\"font-size:18px\">微信支付凭证</span><br/>\n" +
            "<div style=\"text-align:center\">\n" +
            "    <span style=\"font-size:14px; color:grey\">付款金额</span><br/>\n" +
            "<strong><span style=\"text-align:center; font-size:26px; text-align:center;\">¥16.94</span></strong></div><br/>\n" +
            "<span style=\"color:grey; font-size:14px\">收款方　　</span> \n" +
            "<span style=\"font-size:16px\"></span>丁少波<br/>\n" +
            "<span style=\"color:grey; font-size:14px\">交易状态　</span> \n" +
            "<span style=\"font-size:16px\"></span>支付成功，对方已首款<br/><br/>\n" +
            "查看账单详情";
    private static final String wechatPayResult22 = "微信支付凭证\n" +
            "<p style=\"text-align:center\">付款金额</p>\n" +
            "<h1 style=\"text-align:center\">¥16.94</h1>\n" +
            "<span style=\"color:grey; font-size:12px\">收款方　　</span> 丁少波<br/>\n" +
            "<span style=\"color:grey; font-size:16px\">交易状态　</span> 支付成功，对方已首款 支付成功，对方已首款 支付成功，对方已首款<br/><br/>\n" +
            "查看账单详情<br/><a href=\"http://www.w3school.com.cn\">This is a link</a>" +
            "查看账单详情<br/><a href=\"https://www.google.com\">This is a link</a>";

    private static final String html33 = "<span style=\"color:#333;font-size:15px;\">" +
            "<strong>砍价师服务介绍</strong></span><br/><span align=\"right\" style=\"color:#333;font-size:15px;\">" +
            "我们不是中介。</span><br/> <span style=\"color:#333;font-size:15px;\">我们是一群愿意站在买房人一边的，地产业内人士。" +
            "</span><br/><br/><span style=\"color:#333;font-size:15px;\"><strong>砍不下来，不要钱！</strong></span><br/>" +
            "<span style=\"color:#333;font-size:15px;\">类似你请个律师，完全站在你的立场，帮你谈判。我们发心，用立场和专业，改变中国买房人的被动、" +
            "挨宰局面！</span><br/><br/><span style=\"color:#333;font-size:15px;\"><strong>服务流程：</strong></span><br/>" +
            "<span style=\"color:#333;font-size:15px;\">1.砍前培训。砍价师教你和中介、业主交流，哪些话能说，哪些话不能说；</span><br/>" +
            "<span style=\"color:#333;font-size:15px;\">2.选砍价师。和砍价师约见，确认服务，并做各方信息梳理，确定谈判策略。</span>" +
            "<br/><span style=\"color:#333;font-size:15px;\">3.现场谈判。砍价师陪你去现场，协助把控谈判进程；在你砍不动时，再继续全力争取最好价格。" +
            "</span><br/><br/><span style=\"color:#333;font-size:15px;\"><strong>收费标准：</strong></span><br/><span style=\"color:#333;font-size:15px;\">" +
            "记住！砍价是由你自己先砍，砍不动时再由砍价师继续砍；由砍价师多砍下的部分，才按照下列标准收费：</span><br/><span style=\"color:#333;font-size:15px;\">" +
            "<img src=\"http://cn-qinqimaifang-uat.oss-cn-hangzhou.aliyuncs.com/img/specialist/upload/spcetiicwlz1v_54e2e00fa8a6faf66168571654dbfee2.jpg\" _src=\"http://cn-qinqimaifang-uat.oss-cn-hangzhou.aliyuncs.com/img/specialist/upload/spcetiicwlz1v_54e2e00fa8a6faf66168571654dbfee2.jpg\"></span><span style=\"color:#333;font-size:15px;\"><strong>砍不下来，不收费！</strong></span><br/><br/><span style=\"color:#333;font-size:15px;\"><strong>举个例子：</strong></span><br/><span style=\"color:#333;font-size:15px;\">李先生看好一套房子，经过自己努力将价格砍到300万，砍价师在李先生的基础上将价格谈到270万，成功砍下30万，其中0~5万元阶梯价格部分为5万元，5~10万元阶梯价格部分为5万元，10万元以上阶梯价格部分为20万元，则</span><br/><span style=\"color:#333;font-size:15px;\"><strong>应收服务费：5x30％+5x40%+20x50%=13.5万</strong></span><br/><br/><span style=\"color:#333;font-size:15px;\">百度:<a href=\"http://www.w3school.com.cn\">my testlink</a></span><br/><br/><span style=\"color:#333;font-size:15px;\">电话：<a href=\"tel:4008001234\">my phoneNum</a></span><br/><br/><span style=\"color:#333;font-size:15px;\">我邮箱:<a href=\"mailto:dreamcoffeezs@163.com\">my mail</a></span>";

    private static final String br = "你好<br/>我是br标签";

    private static final String h1_h6 = "<h1>这是一个h1标题</h1><h2>这是一个h2标题</h2><h3>这是一个h3标题</h3><h4>这是一个h4标题</h4><h5>这是一个h5标题</h5><h6>这是一个h6标题</h6>";
    private static final String p = "<p style=\"color:red; font-size:20px;\">这是一个段落。</p><p>这是另外一个段落。</p>";
    private static final String p1 = "<p style=\"color:#ff0000; font-size:20px; text-align:right; background-color:#00FF00; text-decoration:line-through\">这是一个段落。</p><p>这是另外一个段落。</p><p style=\"text-indent:50px\">这是另外一个段落。</p>";
    private static final String a = "<a href=\"http://www.w3cschool.cn\">这是一个链接</a>";
    private static final String img = "<img src=\"https://desk-fd.zol-img.com.cn/t_s640x530c5/g5/M00/02/05/ChMkJlbKyaGIGGNjABT85XemdQ8AALIQQI-6pcAFPz9490.jpg\" width=\"104\" height=\"142\">";
    private static final String ol_ul_li = "<ul><li style=\"color:#ff0000; font-size:20px; text-align:right; background-color:#00FF00; text-decoration:line-through\">Coffee</li  style=\"text-indent:50px\"><li>Milk</li></ul> <ol><li>Coffee</li><li>Milk</li></ol> ";
    private static final String div = "<div style=\"color:#ff0000; font-size:20px; background-color:#00FF00\"><h3>这是一个在div元素中的标题</h3><p>这是一个在div元素中的文本</p></div><div style=\"color:#00ff00; font-size:20px; text-align:right; background-color:#FF0000\">这是一个在div元素</div>";
    private static final String span = "<span  style=\"color:#ff0000; font-size:20px; background-color:#00FF00; text-decoration:line-through\">强调文本</span>非强调文本";
    private static final String strong = "<strong style=\"color:#ff0000; font-size:20px; background-color:#00FF00; text-decoration:line-through\">加粗文本</strong>非加粗文本";
    private static final String b = "<b style=\"color:#ff0000; font-size:20px; background-color:#00FF00; text-decoration:line-through\">加粗文本b标签</b>非加粗文本";
    private static final String em = "<em style=\"color:#ff0000; font-size:20px; background-color:#00FF00; text-decoration:line-through\">强调文本em标签</em>非强调文本";
    private static final String i = "<p>He named his car <i>The lightning</i>, The lightning because it<i  style=\"color:#ff0000; font-size:20px; background-color:#00FF00; text-decoration:line-through\"> was very fast</i>.</p>";
    private static final String small = "<small style=\"color:#ff0000; background-color:#00FF00; text-decoration:line-through\">这个文本比较小</small>这个文本比较小";
    private static final String a1 = "<a style=\"color:#ff0000; background-color:#00FF00; font-size:20px; text-decoration:line-through\" href=\"http://www.w3cschool.cn\">这是一个链接</a>";
    private static final String font = "<font size=\"3\" color=\"#FF0000\">这是一些文本！</font> <font size=\"2\" color=\"#0000FF\">这是一些文本！</font> <font face=\"verdana\" color=\"#00FF00\">这是一些文本！</font>";
    private static final String blockquote = "<blockquote cite=\"http://www.worldwildlife.org/who/index.html\">For 50 years, WWF has been protecting the future of nature. The world's leading conservation organization, WWF works in 100 countries and is supported by 1.2 million members in the United States and close to 5 million globally.</blockquote><br/>For 50 years, WWF has been protecting the future of nature. The world's leading conservation organization, WWF works in 100 countries and is supported by 1.2 million members in the United States and close to 5 million globally. ";
    private static final String u = "<p>This is a <u>parragraph</u>.</p>";
    private static final String del = "<p>My <del>favorite color is blue</del></p>";
    private static final String s = "<p><s>我的车是蓝色的。</s></p><p>我的新车是银色的。</p>";
    private static final String strike = "<p>Version 2.0 is <strike>not yet available!</strike> now available!</p>";
    private static final String sup = "<p>This text contains <sup>superscript</sup> text.</p>";
    private static final String sub = "<p>This text contains <sub>subscript</sub> text.</p>";
    private static final String code = "<code>一段电脑代码</code><br/>一段电脑代码";
    private static final String pre = "<pre>\n此例演示如何使用 pre 标签\n对空行和  空格\n进行控制\n</pre>\n此例演示如何使用 pre 标签\n对空行和  空格\n进行控制";
    private static final String hr = "<h1>HTML</h1><p>HTML 是用于描述 web 页面的一种语言。</p><hr><h1>CSS</h1><p>CSS 定义如何显示 HTML 元素。</p> ";
    private static final String divHeightWidth = "<div style=\"background-color:#0000FF; width=100px; height = 80px\">我高度为50px</div>";
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RichText.initCacheDir(this);
        RichText.debugMode = true;


        text = findViewById(R.id.text);

        RichText.from(a1)
                .autoFix(false)
                .urlClick(new OnUrlClickListener() {
                    @Override
                    public boolean urlClicked(String url) {
                        Log.e("Genise", url);
                        return true;
                    }
                })
                .into(text);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        RichText.recycle();
    }
}
