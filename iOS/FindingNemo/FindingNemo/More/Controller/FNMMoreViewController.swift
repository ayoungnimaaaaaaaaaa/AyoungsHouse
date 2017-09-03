//
//  FNMMoreViewController.swift
//  FindingNemo
//
//  Created by SeokWoo Lee on 2017. 9. 3..
//  Copyright © 2017년 SeokWoo Lee. All rights reserved.
//

import UIKit

class FNMMoreViewController: FNMViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        setupNavigationBar()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    
    private func setupNavigationBar() {
        navigationItem.title = "더보기"
    }
}
