//
//  FNMRestaurantDetailViewController.swift
//  FindingNemo
//
//  Created by SeokWoo Lee on 2017. 9. 3..
//  Copyright © 2017년 SeokWoo Lee. All rights reserved.
//

import UIKit

class FNMRestaurantDetailViewController: FNMViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        setupNavigationBar()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    
    private func setupNavigationBar() {
        navigationItem.title = "식당 이름"
        navigationItem.rightBarButtonItem = UIBarButtonItem(title: "리뷰 작성", style: .plain, target: self, action: nil)
    }
}

//  MARK: UITableViewDataSource
extension FNMRestaurantDetailViewController: UITableViewDataSource {
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return 10
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        return UITableViewCell()
    }
}

//  MARK: UITableViewDelegate
extension FNMRestaurantDetailViewController: UITableViewDelegate {
    
}

enum FNMRestaurantDetailItem {
    case FNMRestaurantDetailItemThumbnail
}
