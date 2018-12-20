//
//  ZSDTLazyImageView.h
//  DTCoreTextDemo
//
//  Created by 赵智慧 on 2018/12/14.
//  Copyright © 2018 赵智慧. All rights reserved.
//

#import <DTCoreText.h>
#import "DTLazyImageView.h"

NS_ASSUME_NONNULL_BEGIN

@interface ZSDTLazyImageView : DTLazyImageView

@property(nonatomic,weak) DTAttributedTextContentView *textContentView;

@end

NS_ASSUME_NONNULL_END
