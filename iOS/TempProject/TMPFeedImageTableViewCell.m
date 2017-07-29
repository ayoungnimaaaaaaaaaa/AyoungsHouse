//
//  TMPFeedImageTableViewCell.m
//  TempProject
//
//  Created by SeokWoo Lee on 2017. 7. 20..
//  Copyright © 2017년 SeokWoo Lee. All rights reserved.
//

#import "TMPFeedImageTableViewCell.h"

@interface TMPFeedImageTableViewCell ()

@property (weak, nonatomic) IBOutlet UIImageView *feedImageView;

@end

@implementation TMPFeedImageTableViewCell

- (void)prepareForReuse
{
    [self.feedImageView setImage:nil];
}


- (void)setupWithFeedImage:(UIImage *)image
{
    [self.feedImageView setImage:image];
}

@end
