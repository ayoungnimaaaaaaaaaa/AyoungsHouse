//
//  FNMHomeViewController.swift
//  FindingNemo
//
//  Created by SeokWoo Lee on 2017. 8. 21..
//  Copyright © 2017년 SeokWoo Lee. All rights reserved.
//

import UIKit

let realtimeRestaurantCellIdnetifier = "FNMRealtimeRestaurantTableViewCell"

class FNMHomeViewController: FNMViewController {
    @IBOutlet weak var searchBar: UISearchBar!
    @IBOutlet weak var tableView: UITableView!

    override func viewDidLoad() {
        super.viewDidLoad()
        setupTableView()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    
    private func setupTableView() {
        tableView.register(UINib.init(nibName: realtimeRestaurantCellIdnetifier, bundle: nil), forCellReuseIdentifier: realtimeRestaurantCellIdnetifier)
    }
}

//  MARK: UITableViewDataSource
extension FNMHomeViewController: UITableViewDataSource {
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return 10
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: realtimeRestaurantCellIdnetifier, for: indexPath)
        
        return cell
    }
}


//  MARK: UITableViewDelegate
extension FNMHomeViewController: UITableViewDelegate {
    func tableView(_ tableView: UITableView, estimatedHeightForRowAt indexPath: IndexPath) -> CGFloat {
        return 110.0;
    }
    
    func tableView(_ tableView: UITableView, heightForRowAt indexPath: IndexPath) -> CGFloat {
        return UITableViewAutomaticDimension
    }
    
    func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
        navigationController?.pushViewController(FNMRestaurantDetailViewController(), animated: true)
    }
}


//  MARK: UIScrollViewDelegate
extension FNMHomeViewController: UIScrollViewDelegate {
    func scrollViewWillBeginDragging(_ scrollView: UIScrollView) {
        searchBar.resignFirstResponder()
    }
}
