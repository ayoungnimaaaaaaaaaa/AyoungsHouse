//
//  TMPMapViewController.m
//  TempProject
//
//  Created by SeokWoo Lee on 2017. 7. 19..
//  Copyright © 2017년 SeokWoo Lee. All rights reserved.
//

#import "TMPMapViewController.h"

static NSString *reviewCellIdentifier = @"map.reviewCell";

@interface TMPMapViewController () < UICollectionViewDelegate, UICollectionViewDataSource >

@end

@implementation TMPMapViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    
    [self.navigationItem setTitle:@"주변 보기"];
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
}


#pragma mark - UICollectionViewDataSource

- (UICollectionViewCell *)collectionView:(UICollectionView *)collectionView cellForItemAtIndexPath:(NSIndexPath *)indexPath
{
    UICollectionViewCell *cell = [collectionView dequeueReusableCellWithReuseIdentifier:reviewCellIdentifier forIndexPath:indexPath];
    
    [cell setBackgroundColor:[UIColor grayColor]];
    
    return cell;
}


- (NSInteger)collectionView:(UICollectionView *)collectionView numberOfItemsInSection:(NSInteger)section
{
    return 10;
}

@end
