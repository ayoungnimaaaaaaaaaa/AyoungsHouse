//
//  TMPViewController.m
//  TempProject
//
//  Created by SeokWoo Lee on 2017. 7. 18..
//  Copyright © 2017년 SeokWoo Lee. All rights reserved.
//

#import "TMPViewController.h"

@interface TMPViewController ()

@end

@implementation TMPViewController

#pragma mark - Life Cycle

- (void)viewDidLoad {
    [super viewDidLoad];
    
    [self setNeedsStatusBarAppearanceUpdate];
}


- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
}


#pragma mark - Status Bar

- (UIStatusBarStyle) preferredStatusBarStyle {
    return UIStatusBarStyleLightContent;
}

@end
