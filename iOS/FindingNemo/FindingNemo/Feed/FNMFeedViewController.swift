//
//  FNMFeedViewController.swift
//  FindingNemo
//
//  Created by SeokWoo Lee on 2017. 9. 3..
//  Copyright © 2017년 SeokWoo Lee. All rights reserved.
//

import UIKit

class FNMFeedViewController: FNMViewController {
    @IBOutlet weak var tableView: UITableView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        setupNavigationBar()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    
    private func setupNavigationBar() {
        navigationItem.title = "피드"
    }
}

extension FNMFeedViewController: UITableViewDataSource {
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return 10
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        return UITableViewCell()
    }
}

extension FNMFeedViewController: UITableViewDelegate {
    
}
