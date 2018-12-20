//
//  ViewController.m
//  DTCoreTextDemo
//
//  Created by 赵智慧 on 2018/12/13.
//  Copyright © 2018 赵智慧. All rights reserved.
//
//获取屏幕的大小
//#define ZSToolScreenWidth  [UIScreen mainScreen].bounds.size.width
//#define ZSToolScreenHeight [UIScreen mainScreen].bounds.size.height

#import "ViewController.h"
#import <DTCoreText.h>
#import "ZSDTCoreTextButton.h"
#import "DTAnimatedGIF.h"
#import "ZYTools.h"

@interface ViewController ()<DTAttributedTextContentViewDelegate,DTLazyImageViewDelegate>

@property (strong, nonatomic) DTAttributedLabel *attributedLabel;
@property (nonatomic, copy)NSString *html;
@property (nonatomic, assign) CGRect viewMaxRect;

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    self.view.backgroundColor = [UIColor whiteColor];
    self.navigationController.navigationBar.translucent = NO;
    self.title = @"测试dDTCoreText";
   
    //_html = @"<span style=\"color:#333;font-size:15px;\"><strong>砍价师服务介绍</strong></span><br/><span align=\"right\" style=\"color:#333;font-size:15px;\">我们不是中介。</span><br/> <span style=\"color:#333;font-size:15px;\">我们是一群愿意站在买房人一边的，地产业内人士。</span><br/><br/><span style=\"color:#333;font-size:15px;\"><strong>砍不下来，不要钱！</strong></span><br/><span style=\"color:#333;font-size:15px;\">类似你请个律师，完全站在你的立场，帮你谈判。我们发心，用立场和专业，改变中国买房人的被动、挨宰局面！</span><br/><br/><span style=\"color:#333;font-size:15px;\"><strong>服务流程：</strong></span><br/><span style=\"color:#333;font-size:15px;\">1.砍前培训。砍价师教你和中介、业主交流，哪些话能说，哪些话不能说；</span><br/><span style=\"color:#333;font-size:15px;\">2.选砍价师。和砍价师约见，确认服务，并做各方信息梳理，确定谈判策略。</span><br/><span style=\"color:#333;font-size:15px;\">3.现场谈判。砍价师陪你去现场，协助把控谈判进程；在你砍不动时，再继续全力争取最好价格。</span><br/><br/><span style=\"color:#333;font-size:15px;\"><strong>收费标准：</strong></span><br/><span style=\"color:#333;font-size:15px;\">记住！砍价是由你自己先砍，砍不动时再由砍价师继续砍；由砍价师多砍下的部分，才按照下列标准收费：</span><br/><span style=\"color:#333;font-size:15px;\"><img src=\"http://cn-qinqimaifang-uat.oss-cn-hangzhou.aliyuncs.com/img/specialist/upload/spcetiicwlz1v_54e2e00fa8a6faf66168571654dbfee2.jpg\" _src=\"http://cn-qinqimaifang-uat.oss-cn-hangzhou.aliyuncs.com/img/specialist/upload/spcetiicwlz1v_54e2e00fa8a6faf66168571654dbfee2.jpg\"></span><span style=\"color:#333;font-size:15px;\"><strong>砍不下来，不收费！</strong></span><br/><br/><span style=\"color:#333;font-size:15px;\"><strong>举个例子：</strong></span><br/><span style=\"color:#333;font-size:15px;\">李先生看好一套房子，经过自己努力将价格砍到300万，砍价师在李先生的基础上将价格谈到270万，成功砍下30万，其中0~5万元阶梯价格部分为5万元，5~10万元阶梯价格部分为5万元，10万元以上阶梯价格部分为20万元，则</span><br/><span style=\"color:#333;font-size:15px;\"><strong>应收服务费：5x30％+5x40%+20x50%=13.5万</strong></span><br/><br/><span style=\"color:#333;font-size:15px;\">百度:<a href=\"http://www.w3school.com.cn\">my testlink</a></span><br/><br/><span style=\"color:#333;font-size:15px;\">电话：<a href=\"tel:4008001234\">my phoneNum</a></span><br/><br/><span style=\"color:#333;font-size:15px;\">我邮箱:<a href=\"mailto:dreamcoffeezs@163.com\">my mail</a></span>";
    //Demo1
    //_html = @"<span style=\"font-size:18px\">微信支付凭证</span><br/>\n<div style=\"text-align:center\">\n    <span style=\"font-size:14px; color:grey\">付款金额</span><br/>\n<strong><span style=\"text-align:center; font-size:26px; text-align:center;\">¥16.94</span></strong></div><br/>\n<span style=\"color:grey; font-size:14px\">收款方　　</span> \n<span style=\"font-size:16px\"></span>丁少波<br/>\n<span style=\"color:grey; font-size:14px\">交易状态　</span> \n<span style=\"font-size:16px\"></span>支付成功，对方已首款<br/><br/>\n查看账单详情";
    //Demo2
    _html = @"<img src=\"http://www.w3school.com.cn/i/eg_tulip.jpg\"  width=\"20\" height=\"20\" alt=\"上海鲜花港 - 郁金香\" />上海蜡渣xxx<br/>\n<p style=\"text-align:center\">付款金额</p>\nh1 style=\"text-align:center\">¥16.94</h1>\n查看账单详情";
    //br
    //_html = @"你好<br/>我是br标签";
    //h1_h6
    //_html = @"<h1>这是一个h1标题</h1><h2>这是一个h2标题</h2><h3>这是一个h3标题</h3><h4>这是一个h4标题</h4><h5>这是一个h5标题</h5><h6>这是一个h6标题</h6>";
    //p
    //_html = @"<p style=\"color:#ff0000; font-size:20px; text-align:right; background-color:#00FF00; text-decoration:line-through\">这是一个段落。</p><p>这是另外一个段落。</p><p style=\"text-indent:50px\">这是另外一个段落。</p>";
    //a
    //_html = @"<a href=\"http://www.w3cschool.cn\">这是一个链接</a>";;
    //img
//    _html = @"<img src=\"https://desk-fd.zol-img.com.cn/t_s640x530c5/g5/M00/02/05/ChMkJlbKyaGIGGNjABT85XemdQ8AALIQQI-6pcAFPz9490.jpg\" width=\"104\" height=\"142\">";
    //ul li ol
    //_html = @"<ul><li style=\"color:#ff0000; font-size:20px; text-align:right; background-color:#00FF00; text-decoration:line-through\">Coffee</li  style=\"text-indent:50px\"><li>Milk</li></ul> <ol><li>Coffee</li><li>Milk</li></ol> ";
    //span
    //_html = @"<div style=\"color:#ff0000; font-size:20px; background-color:#00FF00\"><h3>这是一个在div元素中的标题</h3><p>这是一个在div元素中的文本</p></div><div style=\"color:#00ff00; font-size:20px; text-align:right; background-color:#FF0000\">这是一个在div元素</div>";
    //span
    //_html = @"<span  style=\"color:#ff0000; font-size:20px; background-color:#00FF00; text-decoration:line-through\">强调文本</span>非强调文本";
    //strong
    //_html = @"<strong style=\"color:#ff0000; font-size:20px; background-color:#00FF00; text-decoration:line-through\">加粗文本</strong>非加粗文本";
    //b
    //_html = @"<b style=\"color:#ff0000; font-size:20px; background-color:#00FF00; text-decoration:line-through\">加粗文本b标签</b>非加粗文本";
    //em
//    _html = @"<em style=\"color:#ff0000; font-size:20px; background-color:#00FF00; text-decoration:line-through\">强调文本em标签</em>非强调文本";
//    _html = @"<em>强调文本em标签</em>非强调文本";
    //cite
    //_html = @"<p><cite>The Scream</cite> by Edward Munch. Painted in 1893.</p>";
    //dnf
    //_html = @"<dfn>定义项目</dfn>定义项目";
    //i
    //_html = @"<p>He named his car <i>The lightning</i>, The lightning because it<i  style=\"color:#ff0000; font-size:20px; background-color:#00FF00; text-decoration:line-through\"> was very fast</i>.</p>";
    //big
    //_html = @"<big>这个文本比较大</big>这个文本比较大";
    //small
    //_html = @"<small style=\"color:#ff0000; background-color:#00FF00; text-decoration:line-through\">这个文本比较小</small>这个文本比较小";
    //a
    //_html = @"<a  style=\"color:#ff0000; background-color:#00FF00; font-size:20px; text-decoration:line-through\" href=\"http://www.w3cschool.cn\">这是一个链接</a>";
    //font
    //_html = @"<font size=\"3\" color=\"#FF0000\">这是一些文本！</font> <font size=\"2\" color=\"#0000FF\">这是一些文本！</font> <font face=\"verdana\" color=\"#00FF00\">这是一些文本！</font>";
    //blockquote
    //_html = @"<blockquote cite=\"http://www.worldwildlife.org/who/index.html\">For 50 years, WWF has been protecting the future of nature. The world's leading conservation organization, WWF works in 100 countries and is supported by 1.2 million members in the United States and close to 5 million globally.</blockquote><br/>For 50 years, WWF has been protecting the future of nature. The world's leading conservation organization, WWF works in 100 countries and is supported by 1.2 million members in the United States and close to 5 million globally. ";
    //u
    //_html = @"<p>My <del>favorite color is blue</del></p>";
    //s
    //_html = @"<p><s>我的车是蓝色的。</s></p><p>我的新车是银色的。</p>";
    //strike
    //_html = @"<p>Version 2.0 is <strike>not yet available!</strike> now available!</p>";
    //sup
    //_html = @"<p>This text contains <sup>superscript</sup> text.</p>";
    //sub
    //_html = @"<p>This text contains <sub>subscript</sub> text.</p>";
    //code
    //_html = @"<code>一段电脑代码</code><br/>一段电脑代码";
    //pre
    //_html = @"<pre>\n此例演示如何使用 pre 标签\n对空行和  空格\n进行控制\n</pre>\n此例演示如何使用 pre 标签\n对空行和  空格\n进行控制";
    //hr
    //_html = @"<h1>HTML</h1><p>HTML 是用于描述 web 页面的一种语言。</p><hr><h1>CSS</h1><p>CSS 定义如何显示 HTML 元素。</p> ";
    //div height width
    _html = @"<div style=\"background-color:#0000FF; width=100px; height = 80px\">我高度为50px</div>";
    
    _viewMaxRect = CGRectMake(15, 15, ZSToolScreenWidth - 15 * 2, CGFLOAT_HEIGHT_UNKNOWN);
    //创建控件，显示富文本
    [self.view addSubview:self.attributedLabel];

    CGSize textSize = [self getAttributedTextHeightHtml:self.html with_viewMaxRect:_viewMaxRect];
    self.attributedLabel.frame = CGRectMake(_viewMaxRect.origin.x, _viewMaxRect.origin.y, _viewMaxRect.size.width, textSize.height + 30);
    self.attributedLabel.attributedString = [self getAttributedStringWithHtml:self.html];

}

#pragma mark -Delegate: DTAttributedTextContentViewDelegate
//图片占位
//DTCoreText在解析Html的时候，如果遇到网络图片会插入一个占位符
//对于图片类型（DTImageTextAttachmentd）的占位符，我们使用DTLazyImageView来显示
- (UIView *)attributedTextContentView:(DTAttributedTextContentView *)attributedTextContentView viewForAttachment:(DTTextAttachment *)attachment frame:(CGRect)frame {
    
    if ([attachment isKindOfClass:[DTImageTextAttachment class]]) {
        NSString *imageURL = [NSString stringWithFormat:@"%@", attachment.contentURL];
        DTLazyImageView *imageView = [[DTLazyImageView alloc] initWithFrame:frame];
        imageView.delegate = self;//图片懒加载代理
        imageView.contentMode = UIViewContentModeScaleToFill;
        imageView.image = [(DTImageTextAttachment *)attachment image];
        imageView.url = attachment.contentURL;
        
        //处理gif图片
        if ([imageURL containsString:@"gif"]) {
            dispatch_async(dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_DEFAULT, 0), ^{
                NSData *gifData = [NSData dataWithContentsOfURL:attachment.contentURL];
                dispatch_async(dispatch_get_main_queue()
                               , ^{
                                   imageView.image = DTAnimatedGIFFromData(gifData);
                               });
            });
        }
        return imageView;
    }
    return nil;
}

//根据a标签，自定义相应按钮，处理点击事件
//此方法需要我们在这里返回一个可以店点击响应的空间如Button，然后就可以很方便的处理相应事件了，其中：
//url：Html中的超链接（可以根据需要设置http、tel、mailto等）
//identifier:属于该视图的唯一标示性
//frame：超链接字符串所在的位置，需要将自定义按钮设置为此Fame
- (UIView *)attributedTextContentView:(DTAttributedTextContentView *)attributedTextContentView viewForLink:(NSURL *)url identifier:(NSString *)identifier frame:(CGRect)frame {
    ZSDTCoreTextButton *button = [ZSDTCoreTextButton getButtonWithUrl:url.absoluteString withIdentifier:identifier frame:frame];
//    button.backgroundColor = [UIColor purpleColor];
    button.alpha = 0.5;
    return button;
}

#pragma mark Delegate:DTLazyImageViewDelegate
//懒加载图片代理
- (void)lazyImageView:(DTLazyImageView *)lazyImageView didChangeImageSize:(CGSize)size{
    NSURL *url = lazyImageView.url;
    CGSize imageSize = size;
    NSPredicate *pred = [NSPredicate predicateWithFormat:@"contentURL == %@", url];
    // update all attachmentst that match this URL (possibly mutiple images with same size)
    //更新所有匹配URL的占位符视图
    for (DTTextAttachment *oneAttachment in [self.attributedLabel.layoutFrame textAttachmentsWithPredicate:pred]) {
        //update attachments that have no original size, that also sets the display size
        //更新没有自带尺寸的占位视图
        if (CGSizeEqualToSize(oneAttachment.originalSize, CGSizeZero)) {
            //原始图片不带宽高，被识别后修改html
            oneAttachment.originalSize = imageSize;
            //使用新拿到的尺寸更新HTML字符串
            [self configNoSizeImageView:url.absoluteString size:imageSize];
        }
    }
    
    
}

//字符串中画一些图片没有宽高，懒加载图片之后，在此方法中得到图片的宽高
//这个把宽高替换原来的html，然后重新设置富文本
- (void)configNoSizeImageView:(NSString *)url size:(CGSize)size {
    //_viewMaxRectd是预设的最大的Frame
    CGFloat imageSizeScale = size.height/size.width;
    CGFloat widthPx = _viewMaxRect.size.width;
    CGFloat heightPx = widthPx * imageSizeScale;
    
    NSString *imageInfo = [NSString stringWithFormat:@"_src=\"%@\"", url];
    NSString *sizeString = [NSString stringWithFormat:@" style=\"width:%.fpx; height:%.fpx;\"",widthPx,heightPx];
    NSString *newImageInfo = [NSString stringWithFormat:@"_src=\"%@\"%@",url,sizeString];
    
    if ([self.html containsString:imageInfo]) {
        NSString *newHtml = [self.html stringByReplacingOccurrencesOfString:imageInfo withString:newImageInfo];
        //reload newHtml
        
        self.html = newHtml;
        CGSize textSize = [self getAttributedTextHeightHtml:self.html with_viewMaxRect:_viewMaxRect];
        self.attributedLabel.frame = CGRectMake(_viewMaxRect.origin.x, _viewMaxRect.origin.y, _viewMaxRect.size.width, textSize.height + 30);
        self.attributedLabel.attributedString = [self getAttributedStringWithHtml:self.html];
        //self.attributedLabel.attributedString = [self getAttributedStringWithHtml:@"<span style=\"color:#333;font-size:15px;\"><strong>砍价师服务介绍</strong></span>"];
        [self.attributedLabel relayoutText];
    }
}

#pragma mark -private Methods
//使用HtmlStirng,和最大左右间距，计算视图的高度
- (CGSize)getAttributedTextHeightHtml:(NSString *)htmlString with_viewMaxRect:(CGRect)_viewMaxRect {
    //获取富文本
    NSAttributedString *attributedString = [self getAttributedStringWithHtml:htmlString];
    //获取布局器
    DTCoreTextLayouter *layouter = [[DTCoreTextLayouter alloc] initWithAttributedString:attributedString];
    NSRange entireString = NSMakeRange(0, [attributedString length]);
    //获取Frame
    DTCoreTextLayoutFrame *layoutFrame = [layouter layoutFrameWithRect:_viewMaxRect range:entireString];
    //得到大小
    CGSize sizeNeeded = [layoutFrame frame].size;
    return sizeNeeded;
}

//Html->富文本NSAttributedString
- (NSAttributedString *)getAttributedStringWithHtml:(NSString *)htmlString {
    //获取富文本
    NSData *data = [htmlString dataUsingEncoding:NSUTF8StringEncoding];
    NSAttributedString *attributedString = [[NSAttributedString alloc] initWithHTMLData:data documentAttributes:NULL];
    return attributedString;
}

#pragma mark - Getter && Setter
//懒加载创建
- (DTAttributedLabel *)attributedLabel {
    if (_attributedLabel == nil) {
        _attributedLabel = [[DTAttributedLabel alloc] initWithFrame:CGRectZero];
        _attributedLabel.delegate = self;
        _attributedLabel.backgroundColor = [[UIColor alloc] initWithRed:204 / 255.f green:204 / 255.f blue:204 / 255.f alpha:1.0];
        _attributedLabel.edgeInsets = UIEdgeInsetsMake(15, 15, 15, 15);
//        _attributedLabel.backgroundColor = [UIColor lightGrayColor];
    }
    return _attributedLabel;
}

@end
