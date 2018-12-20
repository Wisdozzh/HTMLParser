//
//  ZSDTCoreTextButton.m
//  DTCoreTextDemo
//
//  Created by 赵智慧 on 2018/12/13.
//  Copyright © 2018 赵智慧. All rights reserved.
//

#import "ZSDTCoreTextButton.h"

@implementation ZSDTCoreTextButton

#pragma mark - Life Cycle
+ (ZSDTCoreTextButton *)getButtonWithUrl:(NSString *)url
                          withIdentifier:(NSString *)identifier
                                   frame:(CGRect)frame {
    ZSDTCoreTextButton *button = [[ZSDTCoreTextButton alloc] initWithFrame:frame];
    button.url = url;
    button.identifier = identifier;
    [button addTarget:button action:@selector(onBtnClick:) forControlEvents:UIControlEventAllEvents];
    return button;
}

- (DTButtonUrlType)urlType {
    if([_url hasPrefix:@"http"]) {
        return DTCoreTextUrlType_Http;
    } else if([_url hasPrefix:@"tel"]) {
        return DTCoreTextUrlType_Tel;
    } else if ([_url hasPrefix:@"mailto"]) {
        return DTCoreTextUrlType_Mail;
    }
    return DTCoreTextUrlType_unKnown;
}

#pragma mark - private Method
- (void)onBtnClick:(ZSDTCoreTextButton *)btn {
    switch (btn.urlType) {
        case DTCoreTextUrlType_Http:{
            [ZSDTCoreTextButton openWebPage:btn.url];
            break;
        }
        case DTCoreTextUrlType_Tel:{
            NSString *phoneNum = [[btn.url componentsSeparatedByString:@":"] lastObject];
            [ZSDTCoreTextButton dailPhoneNum:phoneNum];
            break;
        }
        case DTCoreTextUrlType_Mail:{
            break;
        }
        default:
            break;
    }
}

#pragma mark - Public Method
//打开链接
+ (void)openWebPage:(NSString *)url {
    [[UIApplication sharedApplication] openURL:[NSURL URLWithString:url] options:@{} completionHandler:nil];
}

//拨打电话
+ (void)dailPhoneNum:(NSString *)phoneNum {
    NSMutableString *str = [[NSMutableString alloc] initWithFormat:@"tel:%@",phoneNum];
    [[UIApplication sharedApplication] openURL:[NSURL URLWithString:str] options:@{} completionHandler:nil];
}

@end
