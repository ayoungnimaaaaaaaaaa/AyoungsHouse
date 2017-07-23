//
//  TMPFeedViewController.m
//  TempProject
//
//  Created by SeokWoo Lee on 2017. 7. 19..
//  Copyright © 2017년 SeokWoo Lee. All rights reserved.
//

#import "TMPFeedViewController.h"
#import "TMPFeedImageTableViewCell.h"

static NSString *imageCell = @"TMPFeedImageTableViewCell";

@interface TMPFeedViewController () < UITableViewDataSource, UITableViewDelegate >

@property (weak, nonatomic) IBOutlet UITableView *tableView;
@property (strong, nonatomic) NSArray *imageSampleArray;

@end

@implementation TMPFeedViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    [self.navigationItem setTitle:@"피드"];
    
    [self setImageSampleArray:@[[UIImage imageNamed:@"Feed1"],
                                [UIImage imageNamed:@"Feed2"],
                                [UIImage imageNamed:@"Feed3"],
                                [UIImage imageNamed:@"Feed4"],
                                [UIImage imageNamed:@"Feed5"],
                                [UIImage imageNamed:@"Feed6"],
                                [UIImage imageNamed:@"Feed7"]]];
    
    [self.tableView registerNib:[UINib nibWithNibName:imageCell bundle:nil] forCellReuseIdentifier:imageCell];
    
    [self.tableView setEstimatedRowHeight:100.0f];
    [self.tableView setRowHeight:UITableViewAutomaticDimension];
    
    [self.tableView setTableHeaderView:nil];
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
}


#pragma mark - UITableViewDataSource

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath
{
    TMPFeedImageTableViewCell *feedImageTableViewCell = [tableView dequeueReusableCellWithIdentifier:imageCell forIndexPath:indexPath];
    [feedImageTableViewCell setupWithFeedImage:self.imageSampleArray[indexPath.row]];
    
    return feedImageTableViewCell;
}


- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section
{
    return self.imageSampleArray.count;
}

#pragma mark - UITableViewDelegate

@end
