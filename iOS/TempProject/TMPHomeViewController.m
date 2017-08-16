//
//  TMPHomeViewController.m
//  TempProject
//
//  Created by SeokWoo Lee on 2017. 7. 19..
//  Copyright © 2017년 SeokWoo Lee. All rights reserved.
//

#import "TMPHomeViewController.h"

static NSString *realTimeCellIdentifier = @"Home.RealTimeCell";

@interface TMPHomeViewController () < UISearchBarDelegate, UITableViewDelegate, UITableViewDataSource >

@property (weak, nonatomic) IBOutlet UISearchBar *searchBar;
@property (weak, nonatomic) IBOutlet UITableView *tableView;
@property (weak, nonatomic) IBOutlet NSLayoutConstraint *tableViewBottomLayoutConstraint;

@end


@implementation TMPHomeViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    
    [self.navigationItem setTitle:@"홈"];
    [self.navigationController.navigationBar setTintColor:[UIColor greenColor]];
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
}


#pragma mark - UITableViewDataSource

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath
{
    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:realTimeCellIdentifier forIndexPath:indexPath];
    
    [cell.textLabel setText:@"ABC"];
    
    return cell;
}

- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section
{
    return 10;
}


#pragma mark - UIScrollViewDelegate

- (void)scrollViewDidScroll:(UIScrollView *)scrollView
{
    [self.searchBar resignFirstResponder];
}

@end
