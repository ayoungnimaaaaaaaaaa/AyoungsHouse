//
//  FNMNearbyViewController.swift
//  FindingNemo
//
//  Created by SeokWoo Lee on 2017. 9. 3..
//  Copyright © 2017년 SeokWoo Lee. All rights reserved.
//

import UIKit
import MapKit

class FNMNearbyViewController: FNMViewController {
    @IBOutlet weak var mapView: MKMapView!
    @IBOutlet weak var tableView: UITableView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    
    @IBAction func didChangedSegmentedControl(_ sender: UISegmentedControl) {
        print(sender.selectedSegmentIndex)
    }
    
    
}

extension FNMNearbyViewController: UITableViewDataSource {
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return 10
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        return UITableViewCell()
    }
}

extension FNMNearbyViewController: UITableViewDelegate {
    func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
        navigationController?.pushViewController(FNMRestaurantDetailViewController(), animated: true)
    }
}
