//
//  FNMMySpaceViewController.swift
//  FindingNemo
//
//  Created by SeokWoo Lee on 2017. 9. 3..
//  Copyright © 2017년 SeokWoo Lee. All rights reserved.
//

import UIKit

class FNMMySpaceViewController: FNMViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    
    private func setupNavigationBar() {
        navigationItem.title = "내 공간"
        navigationItem.rightBarButtonItem = UIBarButtonItem(title: "리뷰 작성", style: .plain, target: self, action: nil)
    }
}
