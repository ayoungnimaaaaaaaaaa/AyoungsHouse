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
    
    [self registerForKeyboardNotifications];
    
    [self.navigationItem setTitle:@"홈"];
    [self.navigationController.navigationBar setTintColor:[UIColor greenColor]];
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
}


- (void)dealloc
{
    [self unregisterForKeyboardNotifications];
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


#pragma mark - Keyboard

- (void)registerForKeyboardNotifications
{
    [[NSNotificationCenter defaultCenter] addObserver:self selector:@selector(keyboardWasShown:) name:UIKeyboardDidShowNotification object:nil];
    [[NSNotificationCenter defaultCenter] addObserver:self selector:@selector(keyboardWillBeHidden:) name:UIKeyboardWillHideNotification object:nil];
}


- (void)unregisterForKeyboardNotifications
{
    [[NSNotificationCenter defaultCenter] removeObserver:UIKeyboardDidShowNotification];
    [[NSNotificationCenter defaultCenter] removeObserver:UIKeyboardWillHideNotification];
}


- (void)keyboardWasShown:(NSNotification *)notification
{
    NSDictionary *userInfo = notification.userInfo;
    CGSize keyboardFrame = [[userInfo objectForKey:UIKeyboardFrameBeginUserInfoKey] CGRectValue].size;
    
    CGRect viewFrame = self.view.frame;
    viewFrame.size.height -= keyboardFrame.height;
    [self.view setFrame:viewFrame];
}


- (void)keyboardWillBeHidden:(NSNotification *)notification
{
    NSDictionary *userInfo = notification.userInfo;
    CGSize keyboardFrame = [[userInfo objectForKey:UIKeyboardFrameBeginUserInfoKey] CGRectValue].size;
    
    CGRect viewFrame = self.view.frame;
    viewFrame.size.height += keyboardFrame.height;
    [self.view setFrame:viewFrame];
}


@end
