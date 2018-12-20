//
//  ZSDTCoreTextButton.h
//  DTCoreTextDemo
//
//  Created by 赵智慧 on 2018/12/13.
//  Copyright © 2018 赵智慧. All rights reserved.
//

#import <UIKit/UIKit.h>

NS_ASSUME_NONNULL_BEGIN

typedef NS_ENUM(NSInteger, DTButtonUrlType) {
    DTCoreTextUrlType_unKnown,
    DTCoreTextUrlType_Http,
    DTCoreTextUrlType_Tel,
    DTCoreTextUrlType_Mail,
};

//自定义的Button，用于处理富文本中的a标签处理
@interface ZSDTCoreTextButton : UIButton

@property (nonatomic, copy) NSString *url;
@property (nonatomic, copy) NSString *identifier;
@property (nonatomic, assign) DTButtonUrlType urlType;

/**
 类方法创建Button
 
 @param url a标签链接
 @param identifier a标签的ID标识，唯一
 @param frame a标签所在位置
 @return 返回一个用于响应的Button
 */
+ (ZSDTCoreTextButton *)getButtonWithUrl:(NSString *)url
                          withIdentifier:(NSString *)identifier
                                   frame:(CGRect)frame;

//打开链接
+ (void)openWebPage:(NSString *)url;

//拨打电话
+ (void)dailPhoneNum:(NSString *)phoneNum;
@end

NS_ASSUME_NONNULL_END
