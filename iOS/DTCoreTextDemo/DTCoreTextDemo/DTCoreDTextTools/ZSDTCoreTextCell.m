//
//  ZSDTCoreTextCell.m
//  DTCoreTextDemo
//
//  Created by 赵智慧 on 2018/12/14.
//  Copyright © 2018 赵智慧. All rights reserved.
//

#import "ZSDTCoreTextCell.h"

@implementation ZSDTCoreTextCell

- (void)awakeFromNib {
    [super awakeFromNib];
    // Initialization code
}

- (void)setSelected:(BOOL)selected animated:(BOOL)animated {
    [super setSelected:selected animated:animated];

    // Configure the view for the selected state
}

- (void)setHTMLString:(NSString *)html {
    [super setHTMLString:html];
    [self setNeedsLayout];
}

- (void)layoutSubviews {
    [super layoutSubviews];
    //    CGRect frame = CGRectMake(0, 50, self.attributedTextContextView.bounds.size.width, self.attributedTextContextView.bounds.size.height);
    //    self.attributedTextContextView.frame = frame;
}

@end
